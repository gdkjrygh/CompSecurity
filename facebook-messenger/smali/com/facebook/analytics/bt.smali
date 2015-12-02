.class public Lcom/facebook/analytics/bt;
.super Ljava/lang/Object;
.source "DefaultAnalyticsLogger.java"

# interfaces
.implements Lcom/facebook/analytics/av;
.implements Lcom/facebook/base/c;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final c:Lcom/facebook/debug/log/l;


# instance fields
.field private A:Z

.field private B:Lcom/facebook/analytics/al;

.field private C:J

.field private D:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private E:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/facebook/analytics/ca;",
            ">;"
        }
    .end annotation
.end field

.field private final F:Lcom/facebook/analytics/bw;

.field private final G:Lcom/facebook/analytics/by;

.field private H:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/activity/h;",
            ">;"
        }
    .end annotation
.end field

.field private I:Ljava/lang/Runnable;

.field private J:I

.field private K:J

.field private final L:Lcom/facebook/analytics/h/c;

.field private M:Landroid/net/NetworkInfo;

.field private N:Ljava/lang/String;

.field a:Ljava/util/Set;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/analytics/periodicreporters/l;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/content/Context;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/analytics/ak;

.field private final g:Lcom/facebook/common/executors/a;

.field private final h:Ljava/util/concurrent/ExecutorService;

.field private final i:Lcom/facebook/common/process/d;

.field private final j:Lcom/facebook/analytics/a/a;

.field private final k:Lcom/facebook/analytics/h/a;

.field private final l:Landroid/os/PowerManager;

.field private final m:Landroid/app/AlarmManager;

.field private final n:Landroid/view/WindowManager;

.field private final o:Lcom/facebook/common/time/a;

.field private final p:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Lcom/facebook/analytics/i/a;

.field private final t:Lcom/facebook/analytics/g/a;

.field private final u:Landroid/os/Handler;

.field private final v:Lcom/facebook/analytics/bx;

.field private w:Landroid/content/BroadcastReceiver;

.field private x:Ljava/lang/String;

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    const-class v0, Lcom/facebook/analytics/bt;

    sput-object v0, Lcom/facebook/analytics/bt;->b:Ljava/lang/Class;

    .line 66
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/analytics/bt;->c:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljavax/inject/a;Lcom/facebook/analytics/ak;Lcom/facebook/common/executors/a;Ljava/util/concurrent/ExecutorService;Lcom/facebook/common/process/d;Lcom/facebook/analytics/a/a;Landroid/os/PowerManager;Landroid/app/AlarmManager;Landroid/view/WindowManager;Lcom/facebook/common/time/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/analytics/i/a;Lcom/facebook/analytics/g/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/analytics/ak;",
            "Lcom/facebook/common/executors/a;",
            "Ljava/util/concurrent/ExecutorService;",
            "Lcom/facebook/common/process/d;",
            "Lcom/facebook/analytics/a/a;",
            "Landroid/os/PowerManager;",
            "Landroid/app/AlarmManager;",
            "Landroid/view/WindowManager;",
            "Lcom/facebook/common/time/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/analytics/i/a;",
            "Lcom/facebook/analytics/g/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/analytics/bt;->a:Ljava/util/Set;

    .line 101
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/analytics/bt;->y:Z

    .line 102
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/analytics/bt;->z:Z

    .line 108
    sget-object v1, Lcom/facebook/analytics/al;->NONE:Lcom/facebook/analytics/al;

    iput-object v1, p0, Lcom/facebook/analytics/bt;->B:Lcom/facebook/analytics/al;

    .line 121
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/analytics/bt;->H:Ljava/util/Set;

    .line 122
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/analytics/bt;->I:Ljava/lang/Runnable;

    .line 123
    const/4 v1, -0x1

    iput v1, p0, Lcom/facebook/analytics/bt;->J:I

    .line 126
    const-wide/16 v1, -0x1

    iput-wide v1, p0, Lcom/facebook/analytics/bt;->K:J

    .line 151
    iput-object p1, p0, Lcom/facebook/analytics/bt;->d:Landroid/content/Context;

    .line 152
    iput-object p2, p0, Lcom/facebook/analytics/bt;->e:Ljavax/inject/a;

    .line 153
    iput-object p3, p0, Lcom/facebook/analytics/bt;->f:Lcom/facebook/analytics/ak;

    .line 154
    iput-object p4, p0, Lcom/facebook/analytics/bt;->g:Lcom/facebook/common/executors/a;

    .line 155
    iput-object p5, p0, Lcom/facebook/analytics/bt;->h:Ljava/util/concurrent/ExecutorService;

    .line 156
    iput-object p6, p0, Lcom/facebook/analytics/bt;->i:Lcom/facebook/common/process/d;

    .line 157
    iput-object p7, p0, Lcom/facebook/analytics/bt;->j:Lcom/facebook/analytics/a/a;

    .line 158
    iput-object p8, p0, Lcom/facebook/analytics/bt;->l:Landroid/os/PowerManager;

    .line 159
    iput-object p9, p0, Lcom/facebook/analytics/bt;->m:Landroid/app/AlarmManager;

    .line 160
    iput-object p10, p0, Lcom/facebook/analytics/bt;->n:Landroid/view/WindowManager;

    .line 161
    iput-object p11, p0, Lcom/facebook/analytics/bt;->o:Lcom/facebook/common/time/a;

    .line 162
    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/facebook/analytics/bt;->p:Ljavax/inject/a;

    .line 163
    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/facebook/analytics/bt;->q:Ljavax/inject/a;

    .line 164
    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/facebook/analytics/bt;->r:Ljavax/inject/a;

    .line 165
    new-instance v1, Lcom/facebook/analytics/h/a;

    invoke-interface {p11}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lcom/facebook/analytics/h/a;-><init>(J)V

    iput-object v1, p0, Lcom/facebook/analytics/bt;->k:Lcom/facebook/analytics/h/a;

    .line 166
    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/facebook/analytics/bt;->s:Lcom/facebook/analytics/i/a;

    .line 167
    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/facebook/analytics/bt;->t:Lcom/facebook/analytics/g/a;

    .line 168
    new-instance v1, Lcom/facebook/analytics/bx;

    invoke-direct {v1, p0}, Lcom/facebook/analytics/bx;-><init>(Lcom/facebook/analytics/bt;)V

    iput-object v1, p0, Lcom/facebook/analytics/bt;->v:Lcom/facebook/analytics/bx;

    .line 170
    invoke-interface {p11}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/facebook/analytics/bt;->C:J

    .line 171
    new-instance v1, Lcom/facebook/analytics/h/c;

    invoke-direct {v1}, Lcom/facebook/analytics/h/c;-><init>()V

    iput-object v1, p0, Lcom/facebook/analytics/bt;->L:Lcom/facebook/analytics/h/c;

    .line 172
    new-instance v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v1, p0, Lcom/facebook/analytics/bt;->E:Ljava/util/Queue;

    .line 173
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/facebook/analytics/bt;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 174
    new-instance v1, Lcom/facebook/analytics/bw;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bw;-><init>(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/bu;)V

    iput-object v1, p0, Lcom/facebook/analytics/bt;->F:Lcom/facebook/analytics/bw;

    .line 175
    new-instance v1, Lcom/facebook/analytics/by;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/by;-><init>(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/bu;)V

    iput-object v1, p0, Lcom/facebook/analytics/bt;->G:Lcom/facebook/analytics/by;

    .line 178
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/facebook/analytics/bt;->u:Landroid/os/Handler;

    .line 180
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 181
    const-string v2, "android.intent.action.DATE_CHANGED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 182
    const-string v2, "android.intent.action.TIME_SET"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 183
    iget-object v2, p0, Lcom/facebook/analytics/bt;->d:Landroid/content/Context;

    new-instance v3, Lcom/facebook/analytics/bz;

    invoke-direct {v3, p0}, Lcom/facebook/analytics/bz;-><init>(Lcom/facebook/analytics/bt;)V

    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 184
    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/al;)Lcom/facebook/analytics/al;
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/analytics/bt;->B:Lcom/facebook/analytics/al;

    return-object p1
.end method

.method private a(JLcom/facebook/analytics/c;)Lcom/facebook/analytics/cb;
    .locals 3

    .prologue
    .line 636
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "app_state"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "state"

    invoke-virtual {p3}, Lcom/facebook/analytics/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "app"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 639
    invoke-virtual {v0, p1, p2}, Lcom/facebook/analytics/cb;->a(J)Lcom/facebook/analytics/ca;

    .line 640
    iget-object v1, p0, Lcom/facebook/analytics/bt;->s:Lcom/facebook/analytics/i/a;

    invoke-virtual {v1, v0}, Lcom/facebook/analytics/i/a;->e(Lcom/facebook/analytics/cb;)V

    .line 641
    return-object v0
.end method

.method static synthetic a(Lcom/facebook/analytics/bt;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/analytics/bt;->x:Ljava/lang/String;

    return-object p1
.end method

.method private declared-synchronized a(IZ)V
    .locals 3

    .prologue
    .line 241
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "orientation"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "module"

    const-string v2, "device"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "containermodule"

    iget-object v2, p0, Lcom/facebook/analytics/bt;->N:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "orientation_start"

    iget v2, p0, Lcom/facebook/analytics/bt;->J:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "orientation_end"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "event_trigger"

    if-eqz p2, :cond_0

    const-string v0, "foreground"

    :goto_0
    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 248
    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V

    .line 249
    iput p1, p0, Lcom/facebook/analytics/bt;->J:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 250
    monitor-exit p0

    return-void

    .line 241
    :cond_0
    :try_start_1
    const-string v0, "orientation_change"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private a(J)V
    .locals 3

    .prologue
    .line 229
    iget-boolean v0, p0, Lcom/facebook/analytics/bt;->y:Z

    if-eqz v0, :cond_0

    .line 230
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/analytics/bt;->y:Z

    .line 231
    sget-object v0, Lcom/facebook/analytics/c;->FOREGROUNDED:Lcom/facebook/analytics/c;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/analytics/bt;->a(JLcom/facebook/analytics/c;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "key_ui_event"

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    move-result-object v0

    const-string v1, "new_session"

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/ca;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    move-result-object v0

    .line 236
    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V

    .line 238
    :cond_0
    return-void
.end method

.method private a(JLjava/lang/String;)V
    .locals 4

    .prologue
    .line 650
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "session_end"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 651
    invoke-virtual {v0, p3}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "session_timeout"

    const-string v3, "1"

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    move-result-object v1

    const-string v2, "stop_upload"

    const-string v3, "1"

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/ca;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lcom/facebook/analytics/ca;->a(J)Lcom/facebook/analytics/ca;

    .line 655
    iget-object v1, p0, Lcom/facebook/analytics/bt;->s:Lcom/facebook/analytics/i/a;

    iget-object v2, p0, Lcom/facebook/analytics/bt;->M:Landroid/net/NetworkInfo;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/i/a;->a(Landroid/net/NetworkInfo;Lcom/facebook/analytics/cb;)V

    .line 656
    iget-object v1, p0, Lcom/facebook/analytics/bt;->s:Lcom/facebook/analytics/i/a;

    invoke-virtual {v1, v0}, Lcom/facebook/analytics/i/a;->e(Lcom/facebook/analytics/cb;)V

    .line 657
    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V

    .line 658
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/analytics/bt;->z:Z

    .line 659
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 441
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->c(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 442
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v1

    sget-object v2, Landroid/net/NetworkInfo$State;->DISCONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v1, v2, :cond_0

    .line 443
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/analytics/bt;->z:Z

    .line 446
    :cond_0
    iget-object v1, p0, Lcom/facebook/analytics/bt;->s:Lcom/facebook/analytics/i/a;

    iget-object v2, p0, Lcom/facebook/analytics/bt;->M:Landroid/net/NetworkInfo;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/i/a;->a(Landroid/net/NetworkInfo;Landroid/net/NetworkInfo;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/facebook/analytics/bt;->z:Z

    if-eqz v1, :cond_2

    .line 448
    :cond_1
    invoke-direct {p0, v0}, Lcom/facebook/analytics/bt;->a(Landroid/net/NetworkInfo;)V

    .line 449
    iput-object v0, p0, Lcom/facebook/analytics/bt;->M:Landroid/net/NetworkInfo;

    .line 450
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/analytics/bt;->z:Z

    .line 452
    :cond_2
    return-void
.end method

.method private declared-synchronized a(Landroid/net/NetworkInfo;)V
    .locals 3

    .prologue
    .line 253
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "connection_change"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 254
    const-string v1, "device"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 255
    iget-object v1, p0, Lcom/facebook/analytics/bt;->s:Lcom/facebook/analytics/i/a;

    invoke-virtual {v1, v0}, Lcom/facebook/analytics/i/a;->a(Lcom/facebook/analytics/cb;)V

    .line 256
    iget-object v1, p0, Lcom/facebook/analytics/bt;->s:Lcom/facebook/analytics/i/a;

    iget-object v2, p0, Lcom/facebook/analytics/bt;->M:Landroid/net/NetworkInfo;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/i/a;->a(Lcom/facebook/analytics/cb;Landroid/net/NetworkInfo;)V

    .line 257
    iget-object v1, p0, Lcom/facebook/analytics/bt;->s:Lcom/facebook/analytics/i/a;

    iget-object v2, p0, Lcom/facebook/analytics/bt;->M:Landroid/net/NetworkInfo;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/i/a;->a(Landroid/net/NetworkInfo;Lcom/facebook/analytics/cb;)V

    .line 258
    iget-object v1, p0, Lcom/facebook/analytics/bt;->s:Lcom/facebook/analytics/i/a;

    invoke-virtual {v1, v0}, Lcom/facebook/analytics/i/a;->e(Lcom/facebook/analytics/cb;)V

    .line 259
    if-eqz p1, :cond_0

    .line 260
    const-string v1, "state"

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/NetworkInfo$State;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 265
    :cond_0
    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 266
    monitor-exit p0

    return-void

    .line 253
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic a(Lcom/facebook/analytics/bt;IZ)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/bt;->a(IZ)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/bt;J)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/bt;->b(J)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/bt;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/h/e;Z)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/h/e;Z)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/bt;Lcom/facebook/base/activity/h;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/base/activity/h;)V

    return-void
.end method

.method private a(Lcom/facebook/analytics/d;)V
    .locals 2

    .prologue
    .line 401
    invoke-interface {p1}, Lcom/facebook/analytics/d;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/analytics/f/a;->toString()Ljava/lang/String;

    move-result-object v0

    .line 402
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/analytics/bt;->a(Ljava/lang/String;Z)V

    .line 403
    return-void
.end method

.method private declared-synchronized a(Lcom/facebook/analytics/h/b;)V
    .locals 2

    .prologue
    .line 828
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/facebook/analytics/h/b;->FORCE:Lcom/facebook/analytics/h/b;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/facebook/analytics/h/b;->FORCE_RESET:Lcom/facebook/analytics/h/b;

    if-ne p1, v0, :cond_4

    .line 830
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/bt;->k:Lcom/facebook/analytics/h/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/h/a;->c()V

    .line 835
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/analytics/bt;->k:Lcom/facebook/analytics/h/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/h/a;->b()Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 837
    if-eqz v0, :cond_2

    .line 838
    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V

    .line 841
    :cond_2
    sget-object v0, Lcom/facebook/analytics/h/b;->FORCE_RESET:Lcom/facebook/analytics/h/b;

    if-ne p1, v0, :cond_5

    .line 842
    iget-object v0, p0, Lcom/facebook/analytics/bt;->k:Lcom/facebook/analytics/h/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/h/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 846
    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    .line 831
    :cond_4
    :try_start_1
    sget-object v0, Lcom/facebook/analytics/h/b;->CLOCK_RESET:Lcom/facebook/analytics/h/b;

    if-ne p1, v0, :cond_1

    .line 832
    iget-object v0, p0, Lcom/facebook/analytics/bt;->k:Lcom/facebook/analytics/h/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/h/a;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 828
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 843
    :cond_5
    :try_start_2
    sget-object v0, Lcom/facebook/analytics/h/b;->CLOCK_RESET:Lcom/facebook/analytics/h/b;

    if-ne p1, v0, :cond_3

    .line 844
    iget-object v0, p0, Lcom/facebook/analytics/bt;->o:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/bt;->d(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method private declared-synchronized a(Lcom/facebook/analytics/h/e;Z)V
    .locals 3

    .prologue
    .line 858
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/analytics/bt;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 859
    const/4 v0, 0x0

    .line 860
    sget-object v1, Lcom/facebook/analytics/h/e;->CLOCK_CHANGE:Lcom/facebook/analytics/h/e;

    if-ne p1, v1, :cond_3

    .line 861
    sget-object v0, Lcom/facebook/analytics/h/b;->CLOCK_RESET:Lcom/facebook/analytics/h/b;

    .line 870
    :cond_0
    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/h/b;)V

    .line 874
    :cond_1
    invoke-direct {p0}, Lcom/facebook/analytics/bt;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 876
    iget-object v0, p0, Lcom/facebook/analytics/bt;->L:Lcom/facebook/analytics/h/c;

    iget-object v1, p0, Lcom/facebook/analytics/bt;->o:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lcom/facebook/analytics/h/c;->a(JLcom/facebook/analytics/h/e;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 880
    if-eqz v0, :cond_2

    .line 881
    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 884
    :cond_2
    monitor-exit p0

    return-void

    .line 862
    :cond_3
    :try_start_1
    sget-object v1, Lcom/facebook/analytics/h/e;->FOREGROUNDED:Lcom/facebook/analytics/h/e;

    if-eq p1, v1, :cond_4

    sget-object v1, Lcom/facebook/analytics/h/e;->BACKGROUNDED:Lcom/facebook/analytics/h/e;

    if-ne p1, v1, :cond_0

    .line 864
    :cond_4
    if-eqz p2, :cond_5

    .line 865
    sget-object v0, Lcom/facebook/analytics/h/b;->FORCE_RESET:Lcom/facebook/analytics/h/b;

    goto :goto_0

    .line 867
    :cond_5
    sget-object v0, Lcom/facebook/analytics/h/b;->FORCE:Lcom/facebook/analytics/h/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 858
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic a(Lcom/facebook/analytics/bt;)Z
    .locals 1

    .prologue
    .line 63
    iget-boolean v0, p0, Lcom/facebook/analytics/bt;->y:Z

    return v0
.end method

.method static synthetic a(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/ca;)Z
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->e(Lcom/facebook/analytics/ca;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/analytics/bt;)Landroid/view/WindowManager;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/analytics/bt;->n:Landroid/view/WindowManager;

    return-object v0
.end method

.method private declared-synchronized b(J)V
    .locals 4

    .prologue
    .line 412
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/analytics/bt;->y:Z

    if-nez v0, :cond_1

    .line 413
    sget-object v0, Lcom/facebook/analytics/c;->BACKGROUNDED:Lcom/facebook/analytics/c;

    .line 415
    iget-object v1, p0, Lcom/facebook/analytics/bt;->l:Landroid/os/PowerManager;

    invoke-virtual {v1}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v1

    if-nez v1, :cond_0

    .line 417
    sget-object v0, Lcom/facebook/analytics/c;->RESIGN:Lcom/facebook/analytics/c;

    .line 420
    :cond_0
    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/analytics/bt;->a(JLcom/facebook/analytics/c;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 423
    const-string v1, "key_ui_event"

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    move-result-object v1

    const-string v2, "new_session"

    const-string v3, "1"

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/ca;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 427
    iget-object v1, p0, Lcom/facebook/analytics/bt;->s:Lcom/facebook/analytics/i/a;

    iget-object v2, p0, Lcom/facebook/analytics/bt;->M:Landroid/net/NetworkInfo;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/i/a;->a(Landroid/net/NetworkInfo;Lcom/facebook/analytics/cb;)V

    .line 428
    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V

    .line 429
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/analytics/bt;->y:Z

    .line 430
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/analytics/bt;->N:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 432
    :cond_1
    monitor-exit p0

    return-void

    .line 412
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 679
    iget-object v0, p0, Lcom/facebook/analytics/bt;->w:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_0

    .line 680
    new-instance v0, Lcom/facebook/analytics/bv;

    invoke-direct {v0, p0}, Lcom/facebook/analytics/bv;-><init>(Lcom/facebook/analytics/bt;)V

    iput-object v0, p0, Lcom/facebook/analytics/bt;->w:Landroid/content/BroadcastReceiver;

    .line 698
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 699
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 700
    iget-object v1, p0, Lcom/facebook/analytics/bt;->w:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 702
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/facebook/analytics/bt;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->b(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/ca;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->h(Lcom/facebook/analytics/ca;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/analytics/bt;Lcom/facebook/base/activity/h;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->c(Lcom/facebook/base/activity/h;)V

    return-void
.end method

.method private b(Lcom/facebook/analytics/d;)V
    .locals 1

    .prologue
    .line 406
    invoke-interface {p1}, Lcom/facebook/analytics/d;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/analytics/f/a;->toString()Ljava/lang/String;

    move-result-object v0

    .line 407
    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->c(Ljava/lang/String;)V

    .line 408
    return-void
.end method

.method private declared-synchronized b(Lcom/facebook/base/activity/h;)V
    .locals 0

    .prologue
    .line 280
    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method private c(Landroid/content/Context;)Landroid/net/NetworkInfo;
    .locals 1

    .prologue
    .line 705
    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 707
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/analytics/bt;)Lcom/facebook/analytics/ak;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/analytics/bt;->f:Lcom/facebook/analytics/ak;

    return-object v0
.end method

.method private declared-synchronized c(J)V
    .locals 1

    .prologue
    .line 818
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/bt;->k:Lcom/facebook/analytics/h/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/analytics/h/a;->a(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 819
    sget-object v0, Lcom/facebook/analytics/h/b;->PASSIVE:Lcom/facebook/analytics/h/b;

    invoke-direct {p0, v0}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/h/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 821
    :cond_0
    monitor-exit p0

    return-void

    .line 818
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic c(Lcom/facebook/analytics/bt;Lcom/facebook/base/activity/h;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->d(Lcom/facebook/base/activity/h;)V

    return-void
.end method

.method private c(Lcom/facebook/analytics/ca;)V
    .locals 4

    .prologue
    .line 455
    const-wide/16 v0, -0x1

    invoke-virtual {p1}, Lcom/facebook/analytics/ca;->b()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 456
    iget-object v0, p0, Lcom/facebook/analytics/bt;->o:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/ca;->a(J)Lcom/facebook/analytics/ca;

    .line 458
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/analytics/bt;->y:Z

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/ca;->a(Z)Lcom/facebook/analytics/ca;

    .line 459
    return-void
.end method

.method private declared-synchronized c(Lcom/facebook/base/activity/h;)V
    .locals 3

    .prologue
    .line 290
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/bt;->o:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    .line 291
    iget-object v2, p0, Lcom/facebook/analytics/bt;->H:Ljava/util/Set;

    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 292
    invoke-direct {p0}, Lcom/facebook/analytics/bt;->h()V

    .line 293
    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/bt;->a(J)V

    .line 295
    instance-of v0, p1, Lcom/facebook/analytics/d;

    if-eqz v0, :cond_0

    .line 296
    check-cast p1, Lcom/facebook/analytics/d;

    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 305
    :goto_0
    monitor-exit p0

    return-void

    .line 300
    :cond_0
    :try_start_1
    instance-of v0, p1, Lcom/facebook/analytics/ci;

    if-nez v0, :cond_1

    .line 301
    invoke-virtual {p0, p1}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/base/activity/h;)V

    .line 304
    :cond_1
    iget-object v0, p0, Lcom/facebook/analytics/bt;->h:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/facebook/analytics/bt;->G:Lcom/facebook/analytics/by;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 290
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic d(Lcom/facebook/analytics/bt;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/analytics/bt;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private declared-synchronized d(J)V
    .locals 1

    .prologue
    .line 887
    monitor-enter p0

    :try_start_0
    iput-wide p1, p0, Lcom/facebook/analytics/bt;->K:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 888
    monitor-exit p0

    return-void

    .line 887
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic d(Lcom/facebook/analytics/bt;Lcom/facebook/base/activity/h;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->e(Lcom/facebook/base/activity/h;)V

    return-void
.end method

.method private d(Lcom/facebook/analytics/ca;)V
    .locals 2

    .prologue
    .line 465
    const-string v0, "AUTO_SET"

    invoke-virtual {p1}, Lcom/facebook/analytics/ca;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 466
    invoke-direct {p0}, Lcom/facebook/analytics/bt;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/ca;->c(Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 468
    :cond_0
    const-string v0, "AUTO_SET"

    invoke-virtual {p1}, Lcom/facebook/analytics/ca;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 469
    iget-object v0, p0, Lcom/facebook/analytics/bt;->i:Lcom/facebook/common/process/d;

    invoke-interface {v0}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v0

    .line 470
    invoke-virtual {v0}, Lcom/facebook/common/process/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/ca;->d(Ljava/lang/String;)V

    .line 472
    :cond_1
    return-void
.end method

.method private declared-synchronized d(Lcom/facebook/base/activity/h;)V
    .locals 7

    .prologue
    .line 308
    monitor-enter p0

    :try_start_0
    instance-of v1, p1, Lcom/facebook/analytics/d;

    if-eqz v1, :cond_0

    .line 309
    move-object v0, p1

    check-cast v0, Lcom/facebook/analytics/d;

    move-object v1, v0

    invoke-direct {p0, v1}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/d;)V

    .line 312
    :cond_0
    iget-object v1, p0, Lcom/facebook/analytics/bt;->H:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/facebook/analytics/bt;->H:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 313
    iget-object v1, p0, Lcom/facebook/analytics/bt;->o:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    .line 315
    iget-object v3, p0, Lcom/facebook/analytics/bt;->I:Ljava/lang/Runnable;

    if-eqz v3, :cond_1

    .line 316
    sget-object v3, Lcom/facebook/analytics/bt;->c:Lcom/facebook/debug/log/l;

    sget-object v4, Lcom/facebook/analytics/bt;->b:Ljava/lang/Class;

    const-string v5, "Previous sendToBackgroundDetector is still alive"

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    .line 317
    iget-object v3, p0, Lcom/facebook/analytics/bt;->u:Landroid/os/Handler;

    iget-object v4, p0, Lcom/facebook/analytics/bt;->I:Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 318
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/facebook/analytics/bt;->I:Ljava/lang/Runnable;

    .line 321
    :cond_1
    iget-boolean v3, p0, Lcom/facebook/analytics/bt;->A:Z

    if-nez v3, :cond_2

    .line 322
    new-instance v3, Lcom/facebook/analytics/bu;

    invoke-direct {v3, p0, v1, v2}, Lcom/facebook/analytics/bu;-><init>(Lcom/facebook/analytics/bt;J)V

    iput-object v3, p0, Lcom/facebook/analytics/bt;->I:Ljava/lang/Runnable;

    .line 328
    iget-object v3, p0, Lcom/facebook/analytics/bt;->u:Landroid/os/Handler;

    iget-object v4, p0, Lcom/facebook/analytics/bt;->I:Ljava/lang/Runnable;

    const-wide/16 v5, 0x1388

    invoke-virtual {v3, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 331
    :cond_2
    invoke-interface {p1}, Lcom/facebook/base/activity/h;->h()Ljava/lang/String;

    move-result-object v3

    .line 332
    iget-boolean v4, p0, Lcom/facebook/analytics/bt;->A:Z

    if-eqz v4, :cond_3

    .line 334
    invoke-direct {p0, v1, v2, v3}, Lcom/facebook/analytics/bt;->a(JLjava/lang/String;)V

    .line 336
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/facebook/analytics/bt;->A:Z

    .line 337
    sget-object v1, Lcom/facebook/analytics/al;->NONE:Lcom/facebook/analytics/al;

    iput-object v1, p0, Lcom/facebook/analytics/bt;->B:Lcom/facebook/analytics/al;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 340
    :cond_3
    monitor-exit p0

    return-void

    .line 308
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method static synthetic e(Lcom/facebook/analytics/bt;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/facebook/analytics/bt;->i()V

    return-void
.end method

.method private declared-synchronized e(Lcom/facebook/base/activity/h;)V
    .locals 0

    .prologue
    .line 343
    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method private e(Lcom/facebook/analytics/ca;)Z
    .locals 2

    .prologue
    .line 560
    instance-of v0, p1, Lcom/facebook/analytics/cb;

    if-eqz v0, :cond_0

    const-string v0, "wildfire"

    check-cast p1, Lcom/facebook/analytics/cb;

    invoke-virtual {p1}, Lcom/facebook/analytics/cb;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic f()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lcom/facebook/analytics/bt;->b:Ljava/lang/Class;

    return-object v0
.end method

.method private f(Lcom/facebook/analytics/ca;)V
    .locals 3

    .prologue
    .line 590
    iget-object v0, p0, Lcom/facebook/analytics/bt;->E:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 592
    iget-object v0, p0, Lcom/facebook/analytics/bt;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 593
    iget-object v0, p0, Lcom/facebook/analytics/bt;->h:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/facebook/analytics/bt;->F:Lcom/facebook/analytics/bw;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 595
    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/facebook/analytics/bt;)Z
    .locals 1

    .prologue
    .line 63
    iget-boolean v0, p0, Lcom/facebook/analytics/bt;->A:Z

    return v0
.end method

.method static synthetic g(Lcom/facebook/analytics/bt;)Lcom/facebook/analytics/al;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/analytics/bt;->B:Lcom/facebook/analytics/al;

    return-object v0
.end method

.method private g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lcom/facebook/analytics/bt;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private g(Lcom/facebook/analytics/ca;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 611
    invoke-virtual {p1, v2}, Lcom/facebook/analytics/ca;->b(Z)V

    .line 612
    iget-object v0, p0, Lcom/facebook/analytics/bt;->E:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 614
    iget-object v0, p0, Lcom/facebook/analytics/bt;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 615
    iget-object v0, p0, Lcom/facebook/analytics/bt;->h:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/facebook/analytics/bt;->F:Lcom/facebook/analytics/bw;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 617
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/facebook/analytics/bt;)Ljava/util/Queue;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/analytics/bt;->E:Ljava/util/Queue;

    return-object v0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 283
    iget-object v0, p0, Lcom/facebook/analytics/bt;->I:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 284
    iget-object v0, p0, Lcom/facebook/analytics/bt;->u:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/analytics/bt;->I:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 285
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/analytics/bt;->I:Ljava/lang/Runnable;

    .line 287
    :cond_0
    return-void
.end method

.method private h(Lcom/facebook/analytics/ca;)V
    .locals 2

    .prologue
    .line 664
    iget-object v0, p0, Lcom/facebook/analytics/bt;->g:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 666
    iget-object v0, p0, Lcom/facebook/analytics/bt;->f:Lcom/facebook/analytics/ak;

    invoke-interface {v0}, Lcom/facebook/analytics/ak;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 668
    iget-object v0, p0, Lcom/facebook/analytics/bt;->t:Lcom/facebook/analytics/g/a;

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/g/a;->a(Lcom/facebook/analytics/am;)V

    .line 672
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->d(Lcom/facebook/analytics/ca;)V

    .line 675
    iget-object v0, p0, Lcom/facebook/analytics/bt;->j:Lcom/facebook/analytics/a/a;

    new-instance v1, Lcom/facebook/analytics/AnalyticsServiceEvent;

    invoke-direct {v1, p1}, Lcom/facebook/analytics/AnalyticsServiceEvent;-><init>(Lcom/facebook/analytics/ca;)V

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/a/a;->a(Lcom/facebook/analytics/AnalyticsServiceEvent;)V

    .line 676
    return-void
.end method

.method private i()V
    .locals 5

    .prologue
    .line 711
    iget-object v0, p0, Lcom/facebook/analytics/bt;->a:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 712
    iget-object v0, p0, Lcom/facebook/analytics/bt;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 713
    const-class v1, Lcom/facebook/analytics/periodicreporters/l;

    const-class v2, Lcom/facebook/analytics/periodicreporters/ClientPeriodicReporters;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/bt;->a:Ljava/util/Set;

    .line 716
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/bt;->o:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    .line 717
    iget-object v0, p0, Lcom/facebook/analytics/bt;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/periodicreporters/l;

    .line 718
    invoke-interface {v0, v1, v2}, Lcom/facebook/analytics/periodicreporters/l;->a(J)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 719
    invoke-direct {p0}, Lcom/facebook/analytics/bt;->g()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v2, v4}, Lcom/facebook/analytics/periodicreporters/l;->a(JLjava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/ca;

    .line 720
    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V

    goto :goto_0

    .line 724
    :cond_2
    return-void
.end method

.method private j()Z
    .locals 1

    .prologue
    .line 782
    iget-object v0, p0, Lcom/facebook/analytics/bt;->r:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private k()Z
    .locals 1

    .prologue
    .line 790
    iget-object v0, p0, Lcom/facebook/analytics/bt;->q:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()V
    .locals 7

    .prologue
    const-wide/32 v4, 0x36ee80

    .line 192
    iget-object v0, p0, Lcom/facebook/analytics/bt;->p:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/analytics/bt;->d:Landroid/content/Context;

    const-class v2, Lcom/facebook/analytics/periodicreporters/a;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "com.facebook.analytics.periodicreporters.AnalyticsAlarmReceiver.alarm_action"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 195
    iget-object v1, p0, Lcom/facebook/analytics/bt;->d:Landroid/content/Context;

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    .line 201
    iget-object v0, p0, Lcom/facebook/analytics/bt;->m:Landroid/app/AlarmManager;

    invoke-virtual {v0, v6}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 202
    iget-object v0, p0, Lcom/facebook/analytics/bt;->m:Landroid/app/AlarmManager;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/analytics/bt;->o:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    add-long/2addr v2, v4

    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setInexactRepeating(IJJLandroid/app/PendingIntent;)V

    .line 210
    :cond_0
    return-void
.end method

.method public declared-synchronized a(Lcom/facebook/analytics/ca;)V
    .locals 1

    .prologue
    .line 570
    monitor-enter p0

    if-nez p1, :cond_0

    .line 576
    :goto_0
    monitor-exit p0

    return-void

    .line 574
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->c(Lcom/facebook/analytics/ca;)V

    .line 575
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->f(Lcom/facebook/analytics/ca;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 570
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Lcom/facebook/analytics/ca;Lcom/facebook/analytics/g/e;)V
    .locals 1

    .prologue
    .line 584
    invoke-interface {p2, p1}, Lcom/facebook/analytics/g/e;->a(Lcom/facebook/analytics/am;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 585
    invoke-virtual {p0, p1}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/ca;)V

    .line 587
    :cond_0
    return-void
.end method

.method public declared-synchronized a(Lcom/facebook/base/activity/h;)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 349
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/analytics/bt;->o:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v6

    .line 356
    instance-of v1, p1, Lcom/facebook/analytics/d;

    if-eqz v1, :cond_6

    .line 357
    move-object v0, p1

    check-cast v0, Lcom/facebook/analytics/d;

    move-object v1, v0

    invoke-interface {v1}, Lcom/facebook/analytics/d;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/analytics/f/a;->toString()Ljava/lang/String;

    move-result-object v1

    .line 359
    :goto_0
    if-nez v1, :cond_4

    .line 360
    const-string v3, "unknown"

    .line 361
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    move-object v4, v1

    move-object v5, v3

    move-object v3, v1

    .line 367
    :goto_1
    instance-of v1, p1, Lcom/facebook/analytics/e;

    if-eqz v1, :cond_5

    .line 368
    move-object v0, p1

    check-cast v0, Lcom/facebook/analytics/e;

    move-object v1, v0

    invoke-interface {v1}, Lcom/facebook/analytics/e;->a()Ljava/lang/String;

    move-result-object v1

    .line 371
    :goto_2
    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v8, "navigation"

    invoke-direct {v2, v8}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v8, "dest_module"

    invoke-virtual {v2, v8, v5}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {p1}, Lcom/facebook/base/activity/h;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    .line 375
    if-eqz v1, :cond_0

    .line 376
    const-string v5, "dest_module_uri"

    invoke-virtual {v2, v5, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 379
    :cond_0
    if-eqz v4, :cond_1

    .line 380
    const-string v1, "dest_module_class"

    invoke-virtual {v2, v1, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 383
    :cond_1
    iget-object v1, p0, Lcom/facebook/analytics/bt;->x:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 384
    const-string v1, "click_point"

    iget-object v4, p0, Lcom/facebook/analytics/bt;->x:Ljava/lang/String;

    invoke-virtual {v2, v1, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 387
    :cond_2
    iget-object v1, p0, Lcom/facebook/analytics/bt;->N:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 389
    iget-object v1, p0, Lcom/facebook/analytics/bt;->N:Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 393
    :cond_3
    invoke-virtual {v2, v6, v7}, Lcom/facebook/analytics/cb;->a(J)Lcom/facebook/analytics/ca;

    move-result-object v1

    const-string v2, "resume_upload"

    const-string v4, "1"

    invoke-virtual {v1, v2, v4}, Lcom/facebook/analytics/ca;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V

    .line 397
    iput-object v3, p0, Lcom/facebook/analytics/bt;->N:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 398
    monitor-exit p0

    return-void

    :cond_4
    move-object v3, v1

    move-object v4, v2

    move-object v5, v1

    .line 364
    goto :goto_1

    .line 349
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    :cond_5
    move-object v1, v2

    goto :goto_2

    :cond_6
    move-object v1, v2

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 213
    iput-object p1, p0, Lcom/facebook/analytics/bt;->x:Ljava/lang/String;

    .line 214
    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 515
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/analytics/bt;->c(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 516
    monitor-exit p0

    return-void

    .line 515
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 476
    monitor-enter p0

    :try_start_0
    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v0, "log_in"

    invoke-direct {v2, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 477
    const-string v0, "resume_upload"

    const-string v1, "1"

    invoke-virtual {v2, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 479
    if-eqz p1, :cond_0

    .line 480
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

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

    .line 481
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 476
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 485
    :cond_0
    :try_start_1
    invoke-virtual {p0, v2}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V

    .line 487
    sget-object v0, Lcom/facebook/analytics/h/e;->FOREGROUNDED:Lcom/facebook/analytics/h/e;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/h/e;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 488
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized b()V
    .locals 2

    .prologue
    .line 492
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/analytics/bt;->A:Z

    .line 493
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "log_out"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V

    .line 495
    sget-object v0, Lcom/facebook/analytics/h/e;->BACKGROUNDED:Lcom/facebook/analytics/h/e;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/h/e;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 496
    monitor-exit p0

    return-void

    .line 492
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/facebook/analytics/ca;)V
    .locals 1

    .prologue
    .line 603
    monitor-enter p0

    if-nez p1, :cond_0

    .line 608
    :goto_0
    monitor-exit p0

    return-void

    .line 606
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->c(Lcom/facebook/analytics/ca;)V

    .line 607
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bt;->g(Lcom/facebook/analytics/ca;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 603
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 539
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/analytics/bt;->d(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/ca;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 540
    monitor-exit p0

    return-void

    .line 539
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 523
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/analytics/bt;->c(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/ca;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 524
    monitor-exit p0

    return-void

    .line 523
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public c(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;
    .locals 3

    .prologue
    .line 544
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "show_module"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "click_point"

    iget-object v2, p0, Lcom/facebook/analytics/bt;->x:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "source_module"

    iget-object v2, p0, Lcom/facebook/analytics/bt;->N:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "dest_module"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "is_modal"

    invoke-virtual {v0, v1, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized c()V
    .locals 3

    .prologue
    .line 504
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/analytics/bt;->A:Z

    .line 505
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "silent_login"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "resume_upload"

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 507
    monitor-exit p0

    return-void

    .line 504
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 531
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/analytics/bt;->d(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/ca;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 532
    monitor-exit p0

    return-void

    .line 531
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/analytics/cb;
    .locals 3

    .prologue
    .line 553
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "hide_module"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "click_point"

    iget-object v2, p0, Lcom/facebook/analytics/bt;->x:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "source_module"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "dest_module"

    iget-object v2, p0, Lcom/facebook/analytics/bt;->N:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 6

    .prologue
    .line 799
    invoke-direct {p0}, Lcom/facebook/analytics/bt;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 800
    iget-object v0, p0, Lcom/facebook/analytics/bt;->o:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    .line 801
    iget-wide v2, p0, Lcom/facebook/analytics/bt;->K:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x1f4

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 802
    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/bt;->d(J)V

    .line 803
    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/bt;->c(J)V

    .line 808
    :cond_0
    invoke-direct {p0}, Lcom/facebook/analytics/bt;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 809
    sget-object v0, Lcom/facebook/analytics/h/e;->USER_ACTION:Lcom/facebook/analytics/h/e;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/h/e;Z)V

    .line 811
    :cond_1
    return-void
.end method

.method public e()Lcom/facebook/analytics/bx;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lcom/facebook/analytics/bt;->v:Lcom/facebook/analytics/bx;

    return-object v0
.end method
