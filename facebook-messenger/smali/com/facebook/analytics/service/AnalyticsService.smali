.class public Lcom/facebook/analytics/service/AnalyticsService;
.super Landroid/app/Service;
.source "AnalyticsService.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Ljava/lang/String;

.field private static c:Ljava/lang/String;


# instance fields
.field private d:Lcom/facebook/common/e/h;

.field private e:Lcom/facebook/analytics/service/o;

.field private f:Lcom/facebook/analytics/service/a;

.field private g:Lcom/facebook/analytics/service/i;

.field private final h:Ljava/lang/Object;

.field private i:Lcom/facebook/analytics/service/f;

.field private j:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mSelfStartSync"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/facebook/analytics/service/AnalyticsService;

    sput-object v0, Lcom/facebook/analytics/service/AnalyticsService;->a:Ljava/lang/Class;

    .line 28
    const-class v0, Lcom/facebook/analytics/service/AnalyticsService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/analytics/service/AnalyticsService;->b:Ljava/lang/String;

    .line 30
    const-string v0, "selfStart"

    sput-object v0, Lcom/facebook/analytics/service/AnalyticsService;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 37
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->h:Ljava/lang/Object;

    .line 157
    return-void
.end method

.method private a()Landroid/content/Intent;
    .locals 3

    .prologue
    .line 118
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 119
    sget-object v1, Lcom/facebook/analytics/service/AnalyticsService;->c:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 120
    return-object v0
.end method

.method static synthetic a(Lcom/facebook/analytics/service/AnalyticsService;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/analytics/service/AnalyticsService;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/facebook/analytics/service/AnalyticsService;->a(Ljava/util/List;)V

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/analytics/AnalyticsServiceEvent;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 124
    iget-object v1, p0, Lcom/facebook/analytics/service/AnalyticsService;->h:Ljava/lang/Object;

    monitor-enter v1

    .line 125
    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->j:Z

    if-nez v0, :cond_0

    .line 130
    invoke-direct {p0}, Lcom/facebook/analytics/service/AnalyticsService;->a()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/service/AnalyticsService;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 131
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->j:Z

    .line 136
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->g:Lcom/facebook/analytics/service/i;

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/service/i;->a(Ljava/util/List;)V

    .line 137
    monitor-exit v1

    .line 138
    return-void

    .line 133
    :cond_1
    iget-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->d:Lcom/facebook/common/e/h;

    sget-object v2, Lcom/facebook/analytics/service/AnalyticsService;->b:Ljava/lang/String;

    const-string v3, "Failed to start AnalyticsService."

    invoke-interface {v0, v2, v3}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 137
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/facebook/analytics/service/AnalyticsService;Z)Z
    .locals 0

    .prologue
    .line 26
    iput-boolean p1, p0, Lcom/facebook/analytics/service/AnalyticsService;->j:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/analytics/service/AnalyticsService;)Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->j:Z

    return v0
.end method


# virtual methods
.method protected dump(Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 166
    iget-object v1, p0, Lcom/facebook/analytics/service/AnalyticsService;->h:Ljava/lang/Object;

    monitor-enter v1

    .line 167
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mSelfStartRequested: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v2, p0, Lcom/facebook/analytics/service/AnalyticsService;->j:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 168
    iget-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->f:Lcom/facebook/analytics/service/a;

    invoke-virtual {v0, p2}, Lcom/facebook/analytics/service/a;->a(Ljava/io/PrintWriter;)V

    .line 169
    iget-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->g:Lcom/facebook/analytics/service/i;

    invoke-virtual {v0, p2}, Lcom/facebook/analytics/service/i;->a(Ljava/io/PrintWriter;)V

    .line 170
    monitor-exit v1

    .line 171
    return-void

    .line 170
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->e:Lcom/facebook/analytics/service/o;

    return-object v0
.end method

.method public onCreate()V
    .locals 3

    .prologue
    .line 45
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 47
    sget-object v0, Lcom/facebook/analytics/service/AnalyticsService;->a:Ljava/lang/Class;

    const-string v1, "Creating service"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 48
    invoke-static {p0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 50
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 51
    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->d:Lcom/facebook/common/e/h;

    .line 52
    new-instance v0, Lcom/facebook/analytics/service/o;

    invoke-direct {v0, p0}, Lcom/facebook/analytics/service/o;-><init>(Lcom/facebook/analytics/service/AnalyticsService;)V

    iput-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->e:Lcom/facebook/analytics/service/o;

    .line 53
    new-instance v0, Lcom/facebook/analytics/service/p;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/facebook/analytics/service/p;-><init>(Lcom/facebook/analytics/service/AnalyticsService;Lcom/facebook/analytics/service/n;)V

    iput-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->i:Lcom/facebook/analytics/service/f;

    .line 54
    const-class v0, Lcom/facebook/analytics/service/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/service/a;

    iput-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->f:Lcom/facebook/analytics/service/a;

    .line 55
    iget-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->f:Lcom/facebook/analytics/service/a;

    iget-object v2, p0, Lcom/facebook/analytics/service/AnalyticsService;->i:Lcom/facebook/analytics/service/f;

    invoke-virtual {v0, v2}, Lcom/facebook/analytics/service/a;->a(Lcom/facebook/analytics/service/f;)V

    .line 56
    const-class v0, Lcom/facebook/analytics/service/i;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/service/i;

    iput-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->g:Lcom/facebook/analytics/service/i;

    .line 57
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 61
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 62
    iget-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->f:Lcom/facebook/analytics/service/a;

    iget-object v1, p0, Lcom/facebook/analytics/service/AnalyticsService;->i:Lcom/facebook/analytics/service/f;

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/service/a;->b(Lcom/facebook/analytics/service/f;)V

    .line 63
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 69
    .line 70
    if-eqz p1, :cond_0

    .line 71
    sget-object v1, Lcom/facebook/analytics/service/AnalyticsService;->c:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 74
    :cond_0
    if-eqz v0, :cond_2

    .line 75
    iget-object v1, p0, Lcom/facebook/analytics/service/AnalyticsService;->h:Ljava/lang/Object;

    monitor-enter v1

    .line 89
    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->j:Z

    if-nez v0, :cond_1

    .line 90
    invoke-virtual {p0, p3}, Lcom/facebook/analytics/service/AnalyticsService;->stopSelf(I)V

    .line 92
    :cond_1
    monitor-exit v1

    .line 104
    :goto_0
    const/4 v0, 0x2

    return v0

    .line 92
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 96
    :cond_2
    invoke-virtual {p0, p3}, Lcom/facebook/analytics/service/AnalyticsService;->stopSelf(I)V

    .line 97
    iget-object v0, p0, Lcom/facebook/analytics/service/AnalyticsService;->d:Lcom/facebook/common/e/h;

    sget-object v1, Lcom/facebook/analytics/service/AnalyticsService;->b:Ljava/lang/String;

    const-string v2, "AnalyticsService was externally started."

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 1

    .prologue
    .line 114
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
