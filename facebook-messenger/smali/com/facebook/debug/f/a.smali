.class public Lcom/facebook/debug/f/a;
.super Ljava/lang/Object;
.source "UiThreadWatchdog.java"

# interfaces
.implements Lcom/facebook/base/c;


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
.field private final b:Lcom/facebook/common/time/a;

.field private final c:Lcom/facebook/common/v/a;

.field private final d:Landroid/support/v4/a/e;

.field private final e:Lcom/facebook/prefs/shared/d;

.field private final f:Lcom/facebook/prefs/shared/f;

.field private final g:Landroid/os/Handler;

.field private h:Landroid/os/HandlerThread;

.field private i:Landroid/os/Handler;

.field private j:J
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private k:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private l:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private m:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/debug/f/a;

    sput-object v0, Lcom/facebook/debug/f/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/v/a;Landroid/support/v4/a/e;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/time/a;)V
    .locals 4

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lcom/facebook/debug/f/a;->c:Lcom/facebook/common/v/a;

    .line 69
    iput-object p2, p0, Lcom/facebook/debug/f/a;->d:Landroid/support/v4/a/e;

    .line 70
    iput-object p3, p0, Lcom/facebook/debug/f/a;->e:Lcom/facebook/prefs/shared/d;

    .line 71
    iput-object p4, p0, Lcom/facebook/debug/f/a;->b:Lcom/facebook/common/time/a;

    .line 72
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/facebook/debug/f/a;->g:Landroid/os/Handler;

    .line 74
    iget-object v0, p0, Lcom/facebook/debug/f/a;->d:Landroid/support/v4/a/e;

    new-instance v1, Lcom/facebook/debug/f/b;

    invoke-direct {v1, p0}, Lcom/facebook/debug/f/b;-><init>(Lcom/facebook/debug/f/a;)V

    new-instance v2, Landroid/content/IntentFilter;

    sget-object v3, Lcom/facebook/common/v/a;->a:Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 83
    iget-object v0, p0, Lcom/facebook/debug/f/a;->c:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/debug/f/a;->k:Z

    .line 84
    new-instance v0, Lcom/facebook/debug/f/c;

    invoke-direct {v0, p0}, Lcom/facebook/debug/f/c;-><init>(Lcom/facebook/debug/f/a;)V

    iput-object v0, p0, Lcom/facebook/debug/f/a;->f:Lcom/facebook/prefs/shared/f;

    .line 94
    iget-object v0, p0, Lcom/facebook/debug/f/a;->e:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/debug/f/a;->f:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 95
    return-void
.end method

.method static synthetic a(Lcom/facebook/debug/f/a;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->b()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/debug/f/a;Z)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/facebook/debug/f/a;->a(Z)V

    return-void
.end method

.method private a(Ljava/lang/StringBuilder;Ljava/lang/String;[Ljava/lang/StackTraceElement;)V
    .locals 2

    .prologue
    .line 220
    const/4 v0, 0x0

    :goto_0
    array-length v1, p3

    if-ge v0, v1, :cond_0

    .line 221
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    const-string v1, "\tat "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    aget-object v1, p3, v0

    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    const-string v1, "\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 226
    :cond_0
    return-void
.end method

.method private declared-synchronized a(Z)V
    .locals 2

    .prologue
    .line 108
    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/facebook/debug/f/a;->m:Z

    .line 109
    iget-object v0, p0, Lcom/facebook/debug/f/a;->g:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/debug/f/d;

    invoke-direct {v1, p0}, Lcom/facebook/debug/f/d;-><init>(Lcom/facebook/debug/f/a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    monitor-exit p0

    return-void

    .line 108
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic b(Lcom/facebook/debug/f/a;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/debug/f/a;->e:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method private declared-synchronized b()V
    .locals 1

    .prologue
    .line 103
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/debug/f/a;->c:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/debug/f/a;->k:Z

    .line 104
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    monitor-exit p0

    return-void

    .line 103
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized c()V
    .locals 2

    .prologue
    .line 118
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->i()Z

    move-result v0

    .line 119
    iget-boolean v1, p0, Lcom/facebook/debug/f/a;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    .line 146
    :goto_0
    monitor-exit p0

    return-void

    .line 122
    :cond_0
    if-eqz v0, :cond_1

    .line 123
    :try_start_1
    sget-object v0, Lcom/facebook/debug/f/a;->a:Ljava/lang/Class;

    const-string v1, "Starting watchdog"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 124
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "UiThreadWatchdog"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/debug/f/a;->h:Landroid/os/HandlerThread;

    .line 125
    iget-object v0, p0, Lcom/facebook/debug/f/a;->h:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 126
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/debug/f/a;->h:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/facebook/debug/f/a;->i:Landroid/os/Handler;

    .line 128
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/debug/f/a;->l:Z

    .line 129
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->e()V

    .line 130
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->d()V

    .line 132
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    new-instance v1, Lcom/facebook/debug/f/e;

    invoke-direct {v1, p0}, Lcom/facebook/debug/f/e;-><init>(Lcom/facebook/debug/f/a;)V

    invoke-virtual {v0, v1}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 118
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 140
    :cond_1
    :try_start_2
    sget-object v0, Lcom/facebook/debug/f/a;->a:Ljava/lang/Class;

    const-string v1, "Stopping watchdog"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lcom/facebook/debug/f/a;->h:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 142
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/debug/f/a;->h:Landroid/os/HandlerThread;

    .line 143
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/debug/f/a;->i:Landroid/os/Handler;

    .line 144
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/debug/f/a;->l:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/debug/f/a;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->c()V

    return-void
.end method

.method private declared-synchronized d()V
    .locals 4

    .prologue
    .line 149
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/debug/f/a;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 159
    :goto_0
    monitor-exit p0

    return-void

    .line 152
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/debug/f/a;->i:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/debug/f/f;

    invoke-direct {v1, p0}, Lcom/facebook/debug/f/f;-><init>(Lcom/facebook/debug/f/a;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 149
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic d(Lcom/facebook/debug/f/a;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->f()V

    return-void
.end method

.method private e()V
    .locals 4

    .prologue
    .line 162
    iget-boolean v0, p0, Lcom/facebook/debug/f/a;->l:Z

    if-nez v0, :cond_0

    .line 172
    :goto_0
    return-void

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/facebook/debug/f/a;->g:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/debug/f/g;

    invoke-direct {v1, p0}, Lcom/facebook/debug/f/g;-><init>(Lcom/facebook/debug/f/a;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method static synthetic e(Lcom/facebook/debug/f/a;)Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Lcom/facebook/debug/f/a;->l:Z

    return v0
.end method

.method private f()V
    .locals 0

    .prologue
    .line 175
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->g()V

    .line 176
    return-void
.end method

.method static synthetic f(Lcom/facebook/debug/f/a;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->h()V

    return-void
.end method

.method private declared-synchronized g()V
    .locals 2

    .prologue
    .line 179
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/debug/f/a;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 189
    :goto_0
    monitor-exit p0

    return-void

    .line 182
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/debug/f/a;->c:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/debug/f/a;->k:Z

    .line 183
    iget-boolean v0, p0, Lcom/facebook/debug/f/a;->k:Z

    if-eqz v0, :cond_1

    .line 185
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 179
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 188
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/facebook/debug/f/a;->b:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/debug/f/a;->j:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method static synthetic g(Lcom/facebook/debug/f/a;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->d()V

    return-void
.end method

.method private declared-synchronized h()V
    .locals 5

    .prologue
    .line 192
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/debug/f/a;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 213
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 195
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/debug/f/a;->c:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/debug/f/a;->k:Z

    .line 196
    iget-boolean v0, p0, Lcom/facebook/debug/f/a;->k:Z

    if-eqz v0, :cond_2

    .line 198
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 192
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 202
    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/facebook/debug/f/a;->b:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    .line 203
    iget-wide v2, p0, Lcom/facebook/debug/f/a;->j:J

    sub-long/2addr v0, v2

    .line 204
    const-wide/16 v2, 0x258

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    .line 207
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    .line 208
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    const-string v4, "UI Thread has been stuck for more than "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ms."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    const-string v0, "Current UI thread stack\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    const-string v0, "  "

    invoke-direct {p0, v3, v0, v2}, Lcom/facebook/debug/f/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;[Ljava/lang/StackTraceElement;)V

    .line 212
    sget-object v0, Lcom/facebook/debug/f/a;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method static synthetic h(Lcom/facebook/debug/f/a;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->g()V

    return-void
.end method

.method static synthetic i(Lcom/facebook/debug/f/a;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/debug/f/a;->e()V

    return-void
.end method

.method private i()Z
    .locals 1

    .prologue
    .line 216
    iget-boolean v0, p0, Lcom/facebook/debug/f/a;->m:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/debug/f/a;->k:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/debug/f/a;->e:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/prefs/shared/aj;->s:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/debug/f/a;->a(Z)V

    .line 100
    return-void
.end method
