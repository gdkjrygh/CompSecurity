.class public Lcom/facebook/contacts/database/AddressBookPeriodicRunner;
.super Ljava/lang/Object;
.source "AddressBookPeriodicRunner.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


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
.field private final b:Landroid/content/Context;

.field private final c:Landroid/app/AlarmManager;

.field private final d:Lcom/facebook/contacts/data/k;

.field private final e:Lcom/facebook/auth/b/b;

.field private final f:Lcom/facebook/fbservice/ops/k;

.field private final g:Lcom/facebook/common/time/a;

.field private final h:Ljava/util/concurrent/ExecutorService;

.field private final i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lcom/facebook/common/v/a;

.field private final k:Lcom/facebook/config/a/d;

.field private l:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private n:J
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private o:J
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private p:Landroid/app/PendingIntent;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private volatile q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    const-class v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    sput-object v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/AlarmManager;Lcom/facebook/contacts/data/k;Lcom/facebook/auth/b/b;Lcom/facebook/fbservice/ops/k;Lcom/facebook/common/time/a;Ljava/util/concurrent/ExecutorService;Ljavax/inject/a;Lcom/facebook/common/v/a;Lcom/facebook/config/a/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/AlarmManager;",
            "Lcom/facebook/contacts/data/k;",
            "Lcom/facebook/auth/b/b;",
            "Lcom/facebook/fbservice/ops/k;",
            "Lcom/facebook/common/time/a;",
            "Ljava/util/concurrent/ExecutorService;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/common/v/a;",
            "Lcom/facebook/config/a/d;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->o:J

    .line 100
    iput-object p1, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->b:Landroid/content/Context;

    .line 101
    iput-object p2, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->c:Landroid/app/AlarmManager;

    .line 102
    iput-object p3, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->d:Lcom/facebook/contacts/data/k;

    .line 103
    iput-object p4, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->e:Lcom/facebook/auth/b/b;

    .line 104
    iput-object p5, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->f:Lcom/facebook/fbservice/ops/k;

    .line 105
    iput-object p6, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->g:Lcom/facebook/common/time/a;

    .line 106
    iput-object p7, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->h:Ljava/util/concurrent/ExecutorService;

    .line 107
    iput-object p8, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->i:Ljavax/inject/a;

    .line 108
    iput-object p9, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->j:Lcom/facebook/common/v/a;

    .line 109
    iput-object p10, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->k:Lcom/facebook/config/a/d;

    .line 110
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->o()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->l()V

    return-void
.end method

.method private b(Z)V
    .locals 2

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/facebook/contacts/database/a;

    invoke-direct {v1, p0, p1}, Lcom/facebook/contacts/database/a;-><init>(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 136
    return-void
.end method

.method static synthetic c(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->j()V

    return-void
.end method

.method static synthetic g()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private h()Z
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    .line 190
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->e:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 191
    const/4 v0, 0x0

    .line 206
    :goto_0
    return v0

    .line 200
    :cond_0
    iget-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->o:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 202
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->d:Lcom/facebook/contacts/data/k;

    sget-object v1, Lcom/facebook/contacts/data/i;->a:Lcom/facebook/contacts/data/j;

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->o:J

    .line 206
    :cond_1
    invoke-direct {p0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->i()Z

    move-result v0

    goto :goto_0
.end method

.method private i()Z
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 210
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->o:J

    sub-long/2addr v3, v5

    .line 211
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->j:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->a()Z

    move-result v0

    .line 213
    iget-wide v5, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->o:J

    const-wide/16 v7, -0x1

    cmp-long v5, v5, v7

    if-nez v5, :cond_0

    .line 214
    sget-object v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a:Ljava/lang/Class;

    const-string v2, "Contacts sync interval reached: sync has not been run"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move v0, v1

    .line 232
    :goto_0
    return v0

    .line 218
    :cond_0
    if-eqz v0, :cond_1

    const-wide/32 v5, 0x5265c00

    cmp-long v5, v3, v5

    if-ltz v5, :cond_1

    .line 219
    sget-object v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a:Ljava/lang/Class;

    const-string v5, "Contacts sync background interval reached: last sync %dms ago"

    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v6, v2

    invoke-static {v0, v5, v6}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v1

    .line 220
    goto :goto_0

    .line 223
    :cond_1
    if-nez v0, :cond_2

    const-wide/32 v5, 0x36ee80

    cmp-long v5, v3, v5

    if-ltz v5, :cond_2

    .line 224
    sget-object v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a:Ljava/lang/Class;

    const-string v5, "Contacts sync foreground interval reached: last sync %dms ago"

    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v6, v2

    invoke-static {v0, v5, v6}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v1

    .line 225
    goto :goto_0

    .line 228
    :cond_2
    sget-object v5, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a:Ljava/lang/Class;

    const-string v6, "Shouldn\'t sync friends/contacts in %s, last sync %dms ago"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    if-eqz v0, :cond_3

    const-string v0, "background"

    :goto_1
    aput-object v0, v7, v2

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v7, v1

    invoke-static {v5, v6, v7}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v2

    .line 232
    goto :goto_0

    .line 228
    :cond_3
    const-string v0, "foreground"

    goto :goto_1
.end method

.method private declared-synchronized j()V
    .locals 2

    .prologue
    .line 236
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->m:Lcom/google/common/d/a/s;

    .line 238
    sget-object v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a:Ljava/lang/Class;

    const-string v1, "Downloading contacts complete."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 239
    invoke-direct {p0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    monitor-exit p0

    return-void

    .line 236
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private k()V
    .locals 2

    .prologue
    .line 243
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->o:J

    .line 244
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->n:J

    .line 245
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a(Z)V

    .line 246
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/contacts/h/a;->a(Landroid/content/ContentResolver;)V

    .line 248
    return-void
.end method

.method private declared-synchronized l()V
    .locals 4

    .prologue
    .line 251
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->m:Lcom/google/common/d/a/s;

    .line 252
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->l:Lcom/google/common/d/a/s;

    .line 254
    iget-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->n:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 255
    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->n:J

    .line 259
    :goto_0
    iget-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->n:J

    const-wide/32 v2, 0x36ee80

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->n:J

    .line 260
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    monitor-exit p0

    return-void

    .line 257
    :cond_0
    const-wide/16 v0, 0x2

    :try_start_1
    iget-wide v2, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->n:J

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->n:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 251
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private m()V
    .locals 3

    .prologue
    .line 328
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->l:Lcom/google/common/d/a/s;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 330
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 331
    iget-object v1, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->f:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->g:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    .line 336
    sget-object v1, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a:Ljava/lang/Class;

    const-string v2, "startFavoritesSync - starting"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 337
    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->l:Lcom/google/common/d/a/s;

    .line 338
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->l:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/contacts/database/c;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/database/c;-><init>(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 351
    return-void

    .line 328
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private n()V
    .locals 3

    .prologue
    .line 354
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->m:Lcom/google/common/d/a/s;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 356
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 357
    iget-object v1, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->f:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    .line 362
    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->m:Lcom/google/common/d/a/s;

    .line 363
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->m:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/contacts/database/d;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/database/d;-><init>(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 374
    return-void

    .line 354
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private o()V
    .locals 1

    .prologue
    .line 377
    invoke-direct {p0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->n()V

    .line 378
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->l:Lcom/google/common/d/a/s;

    .line 379
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 118
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->b(Z)V

    .line 119
    return-void
.end method

.method declared-synchronized a(Z)V
    .locals 5

    .prologue
    .line 149
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->p:Landroid/app/PendingIntent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    .line 182
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 154
    :cond_1
    :try_start_1
    iget-boolean v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->q:Z

    if-nez v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    invoke-direct {p0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    if-eqz p1, :cond_2

    .line 170
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->n:J

    .line 173
    :cond_2
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->b:Landroid/content/Context;

    const-class v2, Lcom/facebook/contacts/database/AddressBookPeriodicRunner$LocalBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 174
    const-string v1, "com.facebook.orca.database.ACTION_ALARM"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 178
    iget-object v1, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->b:Landroid/content/Context;

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->p:Landroid/app/PendingIntent;

    .line 180
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->n:J

    add-long/2addr v0, v2

    .line 181
    iget-object v2, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->c:Landroid/app/AlarmManager;

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->p:Landroid/app/PendingIntent;

    invoke-virtual {v2, v3, v0, v1, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 149
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 126
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->b(Z)V

    .line 127
    return-void
.end method

.method c()V
    .locals 2

    .prologue
    .line 289
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/facebook/contacts/database/b;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/database/b;-><init>(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 296
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 386
    monitor-enter p0

    .line 387
    :try_start_0
    sget-object v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a:Ljava/lang/Class;

    const-string v1, "Clearing cached user data."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 389
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->m:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 390
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->m:Lcom/google/common/d/a/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 391
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->m:Lcom/google/common/d/a/s;

    .line 394
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->l:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_1

    .line 395
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->l:Lcom/google/common/d/a/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 396
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->l:Lcom/google/common/d/a/s;

    .line 399
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->e()V

    .line 400
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->n:J

    .line 401
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->o:J

    .line 402
    monitor-exit p0

    .line 403
    return-void

    .line 402
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method declared-synchronized e()V
    .locals 2

    .prologue
    .line 299
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->p:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->c:Landroid/app/AlarmManager;

    iget-object v1, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->p:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 301
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->p:Landroid/app/PendingIntent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 303
    :cond_0
    monitor-exit p0

    return-void

    .line 299
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized f()V
    .locals 2

    .prologue
    .line 306
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->l:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_1

    .line 308
    sget-object v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a:Ljava/lang/Class;

    const-string v1, "Not processing address book (favorites sync operation in progress)"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 325
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 311
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->m:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_2

    .line 312
    sget-object v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a:Ljava/lang/Class;

    const-string v1, "Not processing address book (contact sync operation in progress)"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 306
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 317
    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->k:Lcom/facebook/config/a/d;

    sget-object v1, Lcom/facebook/config/a/d;->POKE:Lcom/facebook/config/a/d;

    if-ne v0, v1, :cond_3

    .line 320
    invoke-direct {p0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->o()V

    goto :goto_0

    .line 322
    :cond_3
    invoke-direct {p0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->m()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method
