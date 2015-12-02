.class public Lcom/facebook/common/v/a;
.super Ljava/lang/Object;
.source "AppUserInteractionManager.java"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final e:Lcom/facebook/base/broadcast/a;

.field private final f:Lcom/facebook/common/executors/a;

.field private final g:Lcom/facebook/common/time/a;

.field private final h:Ljava/util/concurrent/ScheduledExecutorService;

.field private final i:Landroid/app/KeyguardManager;

.field private final j:Lcom/facebook/common/v/c;

.field private final k:Ljava/lang/Runnable;

.field private l:Ljava/util/concurrent/ScheduledFuture;

.field private volatile m:Z

.field private volatile n:J

.field private volatile o:J

.field private volatile p:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 32
    const-class v0, Lcom/facebook/common/v/a;

    sput-object v0, Lcom/facebook/common/v/a;->d:Ljava/lang/Class;

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/common/v/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".USER_MAYBE_BECAME_ACTIVE_OR_INACTIVE_IN_APP"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/v/a;->a:Ljava/lang/String;

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/common/v/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".USER_ENTERED_APP"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/v/a;->b:Ljava/lang/String;

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/common/v/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".USER_LEFT_APP"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/v/a;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/base/broadcast/a;Lcom/facebook/common/executors/a;Lcom/facebook/common/time/a;Ljava/util/concurrent/ScheduledExecutorService;Landroid/app/KeyguardManager;)V
    .locals 1
    .param p4    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation runtime Lcom/facebook/common/executors/ForUiThread;
        .end annotation
    .end param

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Lcom/facebook/common/v/b;

    invoke-direct {v0, p0}, Lcom/facebook/common/v/b;-><init>(Lcom/facebook/common/v/a;)V

    iput-object v0, p0, Lcom/facebook/common/v/a;->k:Ljava/lang/Runnable;

    .line 81
    iput-object p1, p0, Lcom/facebook/common/v/a;->e:Lcom/facebook/base/broadcast/a;

    .line 82
    iput-object p2, p0, Lcom/facebook/common/v/a;->f:Lcom/facebook/common/executors/a;

    .line 83
    iput-object p3, p0, Lcom/facebook/common/v/a;->g:Lcom/facebook/common/time/a;

    .line 84
    iput-object p4, p0, Lcom/facebook/common/v/a;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 85
    iput-object p5, p0, Lcom/facebook/common/v/a;->i:Landroid/app/KeyguardManager;

    .line 86
    new-instance v0, Lcom/facebook/common/v/c;

    invoke-direct {v0, p0}, Lcom/facebook/common/v/c;-><init>(Lcom/facebook/common/v/a;)V

    iput-object v0, p0, Lcom/facebook/common/v/a;->j:Lcom/facebook/common/v/c;

    .line 87
    return-void
.end method

.method static synthetic a(Lcom/facebook/common/v/a;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/facebook/common/v/a;->l:Ljava/util/concurrent/ScheduledFuture;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/common/v/a;)Z
    .locals 1

    .prologue
    .line 31
    iget-boolean v0, p0, Lcom/facebook/common/v/a;->m:Z

    return v0
.end method

.method static synthetic b(Lcom/facebook/common/v/a;)Lcom/facebook/base/broadcast/a;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/common/v/a;->e:Lcom/facebook/base/broadcast/a;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/common/v/a;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/common/v/a;->h()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/common/v/a;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/common/v/a;->g()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/common/v/a;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/common/v/a;->i()V

    return-void
.end method

.method private g()V
    .locals 5

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/common/v/a;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/common/v/a;->m:Z

    .line 92
    iget-object v0, p0, Lcom/facebook/common/v/a;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/common/v/a;->o:J

    .line 93
    iget-object v0, p0, Lcom/facebook/common/v/a;->h:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lcom/facebook/common/v/a;->k:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1388

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/v/a;->l:Ljava/util/concurrent/ScheduledFuture;

    .line 98
    iget-object v0, p0, Lcom/facebook/common/v/a;->e:Lcom/facebook/base/broadcast/a;

    sget-object v1, Lcom/facebook/common/v/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 99
    return-void
.end method

.method private h()V
    .locals 2

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/common/v/a;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 103
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/common/v/a;->m:Z

    .line 104
    iget-object v0, p0, Lcom/facebook/common/v/a;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/common/v/a;->n:J

    .line 105
    iget-object v0, p0, Lcom/facebook/common/v/a;->l:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/facebook/common/v/a;->e:Lcom/facebook/base/broadcast/a;

    sget-object v1, Lcom/facebook/common/v/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 114
    :goto_0
    iget-object v0, p0, Lcom/facebook/common/v/a;->e:Lcom/facebook/base/broadcast/a;

    sget-object v1, Lcom/facebook/common/v/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 115
    return-void

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/v/a;->l:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/common/v/a;->l:Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0
.end method

.method private i()V
    .locals 2

    .prologue
    .line 118
    iget-object v0, p0, Lcom/facebook/common/v/a;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 119
    iget-object v0, p0, Lcom/facebook/common/v/a;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/common/v/a;->p:J

    .line 120
    iget-object v0, p0, Lcom/facebook/common/v/a;->e:Lcom/facebook/base/broadcast/a;

    sget-object v1, Lcom/facebook/common/v/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 121
    return-void
.end method

.method private j()Z
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/common/v/a;->i:Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()Z
    .locals 4

    .prologue
    .line 124
    iget-boolean v0, p0, Lcom/facebook/common/v/a;->m:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/common/v/a;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/common/v/a;->o:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1388

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(J)Z
    .locals 4

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/common/v/a;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/common/v/a;->p:J

    sub-long/2addr v0, v2

    cmp-long v0, v0, p1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 148
    iget-boolean v0, p0, Lcom/facebook/common/v/a;->m:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/common/v/a;->j()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(J)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 172
    iget-object v1, p0, Lcom/facebook/common/v/a;->g:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    .line 173
    iget-wide v3, p0, Lcom/facebook/common/v/a;->p:J

    sub-long v3, v1, v3

    cmp-long v3, v3, p1

    if-gez v3, :cond_1

    .line 177
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-boolean v3, p0, Lcom/facebook/common/v/a;->m:Z

    if-eqz v3, :cond_2

    iget-wide v3, p0, Lcom/facebook/common/v/a;->n:J

    sub-long/2addr v1, v3

    cmp-long v1, v1, p1

    if-ltz v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 187
    iget-boolean v0, p0, Lcom/facebook/common/v/a;->m:Z

    return v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 197
    iget-wide v0, p0, Lcom/facebook/common/v/a;->p:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 205
    iget-wide v0, p0, Lcom/facebook/common/v/a;->o:J

    return-wide v0
.end method

.method public f()Lcom/facebook/common/v/c;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/facebook/common/v/a;->j:Lcom/facebook/common/v/c;

    return-object v0
.end method
