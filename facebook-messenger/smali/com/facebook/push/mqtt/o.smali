.class public Lcom/facebook/push/mqtt/o;
.super Ljava/lang/Object;
.source "KeepaliveManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field static final a:Ljava/lang/String;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field static final b:Ljava/lang/String;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field private static final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final d:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final e:Landroid/content/Context;

.field private final f:Landroid/app/AlarmManager;

.field private final g:Lcom/facebook/common/time/a;

.field private final h:I

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Runnable;",
            "Lcom/facebook/push/mqtt/r;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Landroid/app/PendingIntent;

.field private final k:Landroid/app/PendingIntent;

.field private l:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    .line 47
    const-class v0, Lcom/facebook/push/mqtt/o;

    sput-object v0, Lcom/facebook/push/mqtt/o;->c:Ljava/lang/Class;

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/push/mqtt/o;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".ACTION_INEXACT_ALARM"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/push/mqtt/o;->a:Ljava/lang/String;

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/push/mqtt/o;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".ACTION_CUTOFF_ALARM"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/push/mqtt/o;->b:Ljava/lang/String;

    .line 57
    const-wide/32 v0, 0xdbba0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-wide/32 v1, 0x1b7740

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-wide/32 v2, 0x36ee80

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-wide/32 v3, 0x2932e00

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-wide/32 v4, 0x5265c00

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/push/mqtt/o;->d:Lcom/google/common/a/fi;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/AlarmManager;Lcom/facebook/common/time/a;I)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/o;->i:Ljava/util/Map;

    .line 86
    iput-boolean v4, p0, Lcom/facebook/push/mqtt/o;->l:Z

    .line 98
    iput-object p1, p0, Lcom/facebook/push/mqtt/o;->e:Landroid/content/Context;

    .line 99
    iput-object p2, p0, Lcom/facebook/push/mqtt/o;->f:Landroid/app/AlarmManager;

    .line 100
    iput-object p3, p0, Lcom/facebook/push/mqtt/o;->g:Lcom/facebook/common/time/a;

    .line 101
    iput p4, p0, Lcom/facebook/push/mqtt/o;->h:I

    .line 104
    new-instance v0, Lcom/facebook/push/mqtt/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/push/mqtt/q;-><init>(Lcom/facebook/push/mqtt/o;Lcom/facebook/push/mqtt/p;)V

    .line 105
    new-instance v1, Lcom/facebook/c/k;

    sget-object v2, Lcom/facebook/push/mqtt/o;->a:Ljava/lang/String;

    sget-object v3, Lcom/facebook/push/mqtt/o;->b:Ljava/lang/String;

    invoke-static {v2, v0, v3, v0}, Lcom/google/common/a/ev;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ev;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/facebook/c/k;-><init>(Ljava/util/Map;)V

    .line 111
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 112
    sget-object v2, Lcom/facebook/push/mqtt/o;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 113
    sget-object v2, Lcom/facebook/push/mqtt/o;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 115
    iget-object v2, p0, Lcom/facebook/push/mqtt/o;->e:Landroid/content/Context;

    invoke-virtual {v2, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 120
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/facebook/push/mqtt/o;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 121
    iget-object v1, p0, Lcom/facebook/push/mqtt/o;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 122
    iget-object v1, p0, Lcom/facebook/push/mqtt/o;->e:Landroid/content/Context;

    invoke-static {v1, v4, v0, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/o;->j:Landroid/app/PendingIntent;

    .line 124
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/facebook/push/mqtt/o;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 125
    iget-object v1, p0, Lcom/facebook/push/mqtt/o;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    iget-object v1, p0, Lcom/facebook/push/mqtt/o;->e:Landroid/content/Context;

    invoke-static {v1, v4, v0, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/o;->k:Landroid/app/PendingIntent;

    .line 127
    return-void
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 43
    sget-object v0, Lcom/facebook/push/mqtt/o;->c:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/o;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->h()V

    return-void
.end method

.method private a(Lcom/facebook/push/mqtt/r;)V
    .locals 9

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 333
    invoke-virtual {p1}, Lcom/facebook/push/mqtt/r;->c()I

    move-result v0

    if-eqz v0, :cond_0

    .line 334
    sget-object v0, Lcom/facebook/push/mqtt/o;->c:Ljava/lang/Class;

    const-string v1, "Rescheduling un-expired task %d!"

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/r;->d()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/push/mqtt/r;->b()J

    move-result-wide v0

    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->b()J

    move-result-wide v2

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Lcom/google/common/c/a;->a(J)I

    move-result v0

    .line 339
    invoke-virtual {p1, v0}, Lcom/facebook/push/mqtt/r;->a(I)V

    .line 342
    iget-object v1, p0, Lcom/facebook/push/mqtt/o;->i:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/r;->a()Ljava/lang/Runnable;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    sget-object v1, Lcom/facebook/push/mqtt/o;->c:Ljava/lang/Class;

    const-string v2, "Scheduled task %d for %d cycle(s) expiring in %d seconds."

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/r;->d()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    const/4 v4, 0x2

    int-to-long v5, v0

    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->b()J

    move-result-wide v7

    mul-long/2addr v5, v7

    const-wide/16 v7, 0x3e8

    div-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/push/mqtt/r;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 321
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/r;

    .line 322
    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/o;->a(Lcom/facebook/push/mqtt/r;)V

    goto :goto_0

    .line 324
    :cond_0
    return-void
.end method

.method private b()J
    .locals 2

    .prologue
    .line 192
    const-wide/32 v0, 0xdbba0

    return-wide v0
.end method

.method private c()J
    .locals 4

    .prologue
    .line 200
    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->b()J

    move-result-wide v0

    iget v2, p0, Lcom/facebook/push/mqtt/o;->h:I

    int-to-long v2, v2

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x64

    div-long/2addr v0, v2

    return-wide v0
.end method

.method private d()V
    .locals 1

    .prologue
    .line 209
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/o;->l:Z

    if-nez v0, :cond_0

    .line 210
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/push/mqtt/o;->l:Z

    .line 211
    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->e()V

    .line 212
    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->f()V

    .line 214
    :cond_0
    return-void
.end method

.method private e()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 222
    sget-object v0, Lcom/facebook/push/mqtt/o;->d:Lcom/google/common/a/fi;

    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 225
    iget-object v0, p0, Lcom/facebook/push/mqtt/o;->f:Landroid/app/AlarmManager;

    iget-object v2, p0, Lcom/facebook/push/mqtt/o;->g:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->b()J

    move-result-wide v4

    add-long/2addr v2, v4

    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->b()J

    move-result-wide v4

    iget-object v6, p0, Lcom/facebook/push/mqtt/o;->j:Landroid/app/PendingIntent;

    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setInexactRepeating(IJJLandroid/app/PendingIntent;)V

    .line 230
    sget-object v0, Lcom/facebook/push/mqtt/o;->c:Ljava/lang/Class;

    const-string v2, "Resetting inexact alarm for %d seconds"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->b()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    return-void
.end method

.method private f()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 238
    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->b()J

    move-result-wide v0

    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->c()J

    move-result-wide v2

    add-long/2addr v0, v2

    .line 239
    iget-object v2, p0, Lcom/facebook/push/mqtt/o;->f:Landroid/app/AlarmManager;

    iget-object v3, p0, Lcom/facebook/push/mqtt/o;->g:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    add-long/2addr v3, v0

    iget-object v5, p0, Lcom/facebook/push/mqtt/o;->k:Landroid/app/PendingIntent;

    invoke-virtual {v2, v7, v3, v4, v5}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 243
    sget-object v2, Lcom/facebook/push/mqtt/o;->c:Ljava/lang/Class;

    const-string v3, "Resetting cutoff alarm for %d seconds"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const-wide/16 v5, 0x3e8

    div-long/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v7

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 250
    sget-object v0, Lcom/facebook/push/mqtt/o;->c:Ljava/lang/Class;

    const-string v1, "Canceling alarms."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 252
    iget-object v0, p0, Lcom/facebook/push/mqtt/o;->f:Landroid/app/AlarmManager;

    iget-object v1, p0, Lcom/facebook/push/mqtt/o;->j:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 253
    iget-object v0, p0, Lcom/facebook/push/mqtt/o;->f:Landroid/app/AlarmManager;

    iget-object v1, p0, Lcom/facebook/push/mqtt/o;->k:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 255
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/push/mqtt/o;->l:Z

    .line 256
    return-void
.end method

.method private h()V
    .locals 2

    .prologue
    .line 269
    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->i()Lcom/google/common/a/es;

    move-result-object v0

    .line 272
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/r;

    .line 273
    invoke-virtual {v0}, Lcom/facebook/push/mqtt/r;->a()Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 275
    :cond_0
    return-void
.end method

.method private declared-synchronized i()Lcom/google/common/a/es;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/push/mqtt/r;",
            ">;"
        }
    .end annotation

    .prologue
    .line 284
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 286
    iget-object v0, p0, Lcom/facebook/push/mqtt/o;->i:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/r;

    .line 287
    invoke-virtual {v0}, Lcom/facebook/push/mqtt/r;->c()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Lcom/facebook/push/mqtt/r;->a(I)V

    .line 290
    invoke-virtual {v0}, Lcom/facebook/push/mqtt/r;->c()I

    move-result v3

    if-gtz v3, :cond_0

    .line 291
    sget-object v3, Lcom/facebook/push/mqtt/o;->c:Ljava/lang/Class;

    const-string v4, "Expiring task %d"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/r;->d()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 284
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 298
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 303
    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/o;->a(Ljava/util/List;)V

    .line 307
    iget-object v1, p0, Lcom/facebook/push/mqtt/o;->i:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 308
    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 313
    :goto_1
    monitor-exit p0

    return-object v0

    .line 310
    :cond_2
    :try_start_2
    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/Runnable;J)V
    .locals 1

    .prologue
    .line 142
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    invoke-virtual {p0, p2, p3}, Lcom/facebook/push/mqtt/o;->a(J)Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 146
    iget-object v0, p0, Lcom/facebook/push/mqtt/o;->i:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    invoke-direct {p0}, Lcom/facebook/push/mqtt/o;->d()V

    .line 151
    :cond_0
    new-instance v0, Lcom/facebook/push/mqtt/r;

    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/push/mqtt/r;-><init>(Ljava/lang/Runnable;J)V

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/o;->a(Lcom/facebook/push/mqtt/r;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    monitor-exit p0

    return-void

    .line 142
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(J)Z
    .locals 2

    .prologue
    .line 162
    sget-object v0, Lcom/facebook/push/mqtt/o;->d:Lcom/google/common/a/fi;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public declared-synchronized a(Ljava/lang/Runnable;)Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 172
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/o;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    if-nez v0, :cond_0

    move v0, v1

    .line 184
    :goto_0
    monitor-exit p0

    return v0

    .line 177
    :cond_0
    :try_start_1
    sget-object v1, Lcom/facebook/push/mqtt/o;->c:Ljava/lang/Class;

    const-string v3, "Canceled task %d"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/r;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v1, v3, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v0, v2

    .line 184
    goto :goto_0

    .line 172
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
