.class public Lcom/facebook/common/c/a;
.super Ljava/lang/Object;
.source "FbSdcardLogger.java"

# interfaces
.implements Lcom/facebook/base/c;
.implements Lcom/facebook/debug/log/e;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Ljava/text/SimpleDateFormat;


# instance fields
.field private final c:Lcom/facebook/prefs/shared/d;

.field private final d:Ljava/lang/String;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private f:Landroid/os/HandlerThread;

.field private g:Landroid/os/Handler;

.field private volatile h:Z

.field private i:Lcom/facebook/common/c/d;

.field private j:Lcom/facebook/prefs/shared/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 41
    const-class v0, Lcom/facebook/common/c/a;

    sput-object v0, Lcom/facebook/common/c/a;->a:Ljava/lang/Class;

    .line 47
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "MM-dd HH:mm:ss.SSS"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/common/c/a;->b:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/PackageInfo;Lcom/facebook/prefs/shared/d;Ljavax/inject/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/pm/PackageInfo;",
            "Lcom/facebook/prefs/shared/d;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p2, p0, Lcom/facebook/common/c/a;->c:Lcom/facebook/prefs/shared/d;

    .line 66
    iget-object v0, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/common/c/a;->d:Ljava/lang/String;

    .line 67
    iput-object p3, p0, Lcom/facebook/common/c/a;->e:Ljavax/inject/a;

    .line 68
    return-void
.end method

.method static synthetic a(Lcom/facebook/common/c/a;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/common/c/a;->e()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/common/c/a;)Lcom/facebook/common/c/d;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/common/c/a;->i:Lcom/facebook/common/c/d;

    return-object v0
.end method

.method static synthetic c()Ljava/text/SimpleDateFormat;
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/facebook/common/c/a;->b:Ljava/text/SimpleDateFormat;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/common/c/a;)Z
    .locals 1

    .prologue
    .line 39
    iget-boolean v0, p0, Lcom/facebook/common/c/a;->h:Z

    return v0
.end method

.method static synthetic d()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/facebook/common/c/a;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/common/c/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/common/c/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method private declared-synchronized e()V
    .locals 1

    .prologue
    .line 87
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/c/a;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 88
    if-eqz v0, :cond_0

    .line 89
    invoke-direct {p0}, Lcom/facebook/common/c/a;->f()V

    .line 91
    :cond_0
    iput-boolean v0, p0, Lcom/facebook/common/c/a;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    monitor-exit p0

    return-void

    .line 87
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized f()V
    .locals 2

    .prologue
    .line 111
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/c/a;->f:Landroid/os/HandlerThread;

    if-nez v0, :cond_0

    .line 112
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "logger"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/common/c/a;->f:Landroid/os/HandlerThread;

    .line 113
    iget-object v0, p0, Lcom/facebook/common/c/a;->f:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 114
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/common/c/a;->f:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/facebook/common/c/a;->g:Landroid/os/Handler;

    .line 115
    new-instance v0, Lcom/facebook/common/c/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/common/c/d;-><init>(Lcom/facebook/common/c/a;Lcom/facebook/common/c/b;)V

    iput-object v0, p0, Lcom/facebook/common/c/a;->i:Lcom/facebook/common/c/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    :cond_0
    monitor-exit p0

    return-void

    .line 111
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 72
    new-instance v0, Lcom/facebook/common/c/b;

    invoke-direct {v0, p0}, Lcom/facebook/common/c/b;-><init>(Lcom/facebook/common/c/a;)V

    iput-object v0, p0, Lcom/facebook/common/c/a;->j:Lcom/facebook/prefs/shared/f;

    .line 82
    iget-object v0, p0, Lcom/facebook/common/c/a;->c:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/common/c/a;->j:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 83
    invoke-direct {p0}, Lcom/facebook/common/c/a;->e()V

    .line 84
    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 95
    iget-boolean v0, p0, Lcom/facebook/common/c/a;->h:Z

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/facebook/common/c/a;->g:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/common/c/c;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/facebook/common/c/c;-><init>(Lcom/facebook/common/c/a;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 103
    :cond_0
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/common/c/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 106
    invoke-direct {p0}, Lcom/facebook/common/c/a;->f()V

    .line 107
    iget-object v0, p0, Lcom/facebook/common/c/a;->i:Lcom/facebook/common/c/d;

    invoke-virtual {v0}, Lcom/facebook/common/c/d;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
