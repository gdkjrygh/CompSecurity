.class public Lcom/facebook/e/a/h;
.super Ljava/lang/Object;
.source "ResourceMonitor.java"


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
.field private b:Lcom/facebook/e/a/e;

.field private final c:Ljava/lang/Runnable;

.field private final d:Ljava/lang/Runnable;

.field private e:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Z

.field private final i:Ljava/util/concurrent/ScheduledExecutorService;

.field private final j:Lcom/facebook/common/hardware/q;

.field private final k:Lcom/facebook/common/hardware/t;

.field private final l:Lcom/facebook/base/broadcast/j;

.field private final m:Lcom/facebook/base/broadcast/l;

.field private final n:Lcom/facebook/c/b;

.field private final o:Lcom/facebook/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/facebook/e/a/h;

    sput-object v0, Lcom/facebook/e/a/h;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/hardware/q;Lcom/facebook/base/broadcast/j;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 3

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lcom/facebook/e/a/h;->j:Lcom/facebook/common/hardware/q;

    .line 58
    iput-object p2, p0, Lcom/facebook/e/a/h;->l:Lcom/facebook/base/broadcast/j;

    .line 59
    iput-object p3, p0, Lcom/facebook/e/a/h;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 61
    new-instance v0, Lcom/facebook/e/a/i;

    invoke-direct {v0, p0}, Lcom/facebook/e/a/i;-><init>(Lcom/facebook/e/a/h;)V

    iput-object v0, p0, Lcom/facebook/e/a/h;->c:Ljava/lang/Runnable;

    .line 72
    new-instance v0, Lcom/facebook/e/a/j;

    invoke-direct {v0, p0}, Lcom/facebook/e/a/j;-><init>(Lcom/facebook/e/a/h;)V

    iput-object v0, p0, Lcom/facebook/e/a/h;->d:Ljava/lang/Runnable;

    .line 83
    new-instance v0, Lcom/facebook/e/a/k;

    invoke-direct {v0, p0}, Lcom/facebook/e/a/k;-><init>(Lcom/facebook/e/a/h;)V

    iput-object v0, p0, Lcom/facebook/e/a/h;->k:Lcom/facebook/common/hardware/t;

    .line 97
    new-instance v0, Lcom/facebook/e/a/l;

    invoke-direct {v0, p0}, Lcom/facebook/e/a/l;-><init>(Lcom/facebook/e/a/h;)V

    iput-object v0, p0, Lcom/facebook/e/a/h;->n:Lcom/facebook/c/b;

    .line 104
    new-instance v0, Lcom/facebook/e/a/m;

    invoke-direct {v0, p0}, Lcom/facebook/e/a/m;-><init>(Lcom/facebook/e/a/h;)V

    iput-object v0, p0, Lcom/facebook/e/a/h;->o:Lcom/facebook/c/b;

    .line 112
    iget-object v0, p0, Lcom/facebook/e/a/h;->l:Lcom/facebook/base/broadcast/j;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/j;->a()Lcom/facebook/base/broadcast/k;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/v/a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/e/a/h;->n:Lcom/facebook/c/b;

    invoke-interface {v0, v1, v2}, Lcom/facebook/base/broadcast/k;->a(Ljava/lang/String;Lcom/facebook/c/b;)Lcom/facebook/base/broadcast/k;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/v/a;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/e/a/h;->o:Lcom/facebook/c/b;

    invoke-interface {v0, v1, v2}, Lcom/facebook/base/broadcast/k;->a(Ljava/lang/String;Lcom/facebook/c/b;)Lcom/facebook/base/broadcast/k;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/base/broadcast/k;->a()Lcom/facebook/base/broadcast/l;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/e/a/h;->m:Lcom/facebook/base/broadcast/l;

    .line 116
    return-void
.end method

.method static synthetic a(Lcom/facebook/e/a/h;)Lcom/facebook/e/a/e;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/e/a/h;->b:Lcom/facebook/e/a/e;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/facebook/e/a/h;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/e/a/h;Z)Z
    .locals 0

    .prologue
    .line 23
    iput-boolean p1, p0, Lcom/facebook/e/a/h;->g:Z

    return p1
.end method

.method private declared-synchronized b()V
    .locals 7

    .prologue
    .line 146
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/e/a/h;->g:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/facebook/e/a/h;->h:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/e/a/h;->e:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/e/a/h;->f:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_2

    .line 148
    :cond_0
    sget-object v0, Lcom/facebook/e/a/h;->a:Ljava/lang/Class;

    const-string v1, "ResourceManager onStart"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lcom/facebook/e/a/h;->e:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_1

    .line 151
    iget-object v0, p0, Lcom/facebook/e/a/h;->i:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lcom/facebook/e/a/h;->c:Ljava/lang/Runnable;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x3e8

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/e/a/h;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 155
    :cond_1
    iget-object v0, p0, Lcom/facebook/e/a/h;->f:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_2

    .line 156
    iget-object v0, p0, Lcom/facebook/e/a/h;->i:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lcom/facebook/e/a/h;->d:Ljava/lang/Runnable;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1388

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/e/a/h;->f:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    :cond_2
    monitor-exit p0

    return-void

    .line 146
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic b(Lcom/facebook/e/a/h;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/facebook/e/a/h;->b()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/e/a/h;Z)Z
    .locals 0

    .prologue
    .line 23
    iput-boolean p1, p0, Lcom/facebook/e/a/h;->h:Z

    return p1
.end method

.method private declared-synchronized c()V
    .locals 2

    .prologue
    .line 163
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/e/a/h;->e:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/e/a/h;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_2

    .line 164
    :cond_0
    sget-object v0, Lcom/facebook/e/a/h;->a:Ljava/lang/Class;

    const-string v1, "ResourceManager onStop"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 166
    iget-object v0, p0, Lcom/facebook/e/a/h;->e:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    .line 167
    iget-object v0, p0, Lcom/facebook/e/a/h;->e:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 168
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/e/a/h;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 170
    :cond_1
    iget-object v0, p0, Lcom/facebook/e/a/h;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_2

    .line 171
    iget-object v0, p0, Lcom/facebook/e/a/h;->f:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 172
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/e/a/h;->f:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    :cond_2
    monitor-exit p0

    return-void

    .line 163
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic c(Lcom/facebook/e/a/h;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/facebook/e/a/h;->c()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/e/a/e;)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 125
    iput-object p1, p0, Lcom/facebook/e/a/h;->b:Lcom/facebook/e/a/e;

    .line 126
    iput-boolean v0, p0, Lcom/facebook/e/a/h;->g:Z

    .line 127
    iput-boolean v0, p0, Lcom/facebook/e/a/h;->h:Z

    .line 128
    invoke-direct {p0}, Lcom/facebook/e/a/h;->b()V

    .line 129
    iget-object v0, p0, Lcom/facebook/e/a/h;->m:Lcom/facebook/base/broadcast/l;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/l;->b()V

    .line 130
    iget-object v0, p0, Lcom/facebook/e/a/h;->j:Lcom/facebook/common/hardware/q;

    iget-object v1, p0, Lcom/facebook/e/a/h;->k:Lcom/facebook/common/hardware/t;

    invoke-virtual {v0, v1}, Lcom/facebook/common/hardware/q;->a(Lcom/facebook/common/hardware/t;)V

    .line 131
    return-void
.end method
