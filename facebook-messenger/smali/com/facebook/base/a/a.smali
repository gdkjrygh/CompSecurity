.class public abstract Lcom/facebook/base/a/a;
.super Ljava/lang/Object;
.source "AbstractApplicationLike.java"

# interfaces
.implements Lcom/facebook/base/a/i;


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field protected final a:Landroid/app/Application;

.field private c:Lcom/facebook/inject/t;

.field private final d:Lcom/facebook/config/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/base/a/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/base/a/a;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/facebook/config/a/a;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/facebook/base/a/a;->a:Landroid/app/Application;

    .line 49
    iput-object p2, p0, Lcom/facebook/base/a/a;->d:Lcom/facebook/config/a/a;

    .line 50
    return-void
.end method

.method static synthetic a(Lcom/facebook/base/a/a;)Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/base/a/a;->c:Lcom/facebook/inject/t;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/base/a/a;Lcom/facebook/inject/t;Lcom/facebook/common/process/c;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Lcom/facebook/base/a/a;->a(Lcom/facebook/inject/t;Lcom/facebook/common/process/c;)V

    return-void
.end method

.method private a(Lcom/facebook/inject/t;Lcom/facebook/common/process/c;)V
    .locals 3

    .prologue
    .line 183
    if-nez p2, :cond_0

    .line 184
    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    .line 185
    const-string v1, "INVALID_PROCESS_NAME"

    const-string v2, "Invalid process name."

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    :cond_0
    return-void
.end method

.method private g()Lcom/facebook/common/process/c;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/base/a/a;->a:Landroid/app/Application;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 177
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/b/a;->a(Ljava/lang/Object;)Ljavax/inject/a;

    move-result-object v1

    .line 178
    new-instance v2, Lcom/facebook/common/process/a;

    iget-object v3, p0, Lcom/facebook/base/a/a;->a:Landroid/app/Application;

    invoke-direct {v2, v3, v0, v1}, Lcom/facebook/common/process/a;-><init>(Landroid/content/Context;Landroid/app/ActivityManager;Ljavax/inject/a;)V

    .line 179
    invoke-interface {v2}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v0

    return-object v0
.end method

.method private h()V
    .locals 3

    .prologue
    .line 191
    sget-object v0, Lcom/facebook/base/a/a;->b:Ljava/lang/String;

    const-string v1, "Forcing initialization of AsyncTask"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    :try_start_0
    const-string v0, "android.os.AsyncTask"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    :goto_0
    return-void

    .line 194
    :catch_0
    move-exception v0

    .line 195
    sget-object v1, Lcom/facebook/base/a/a;->b:Ljava/lang/String;

    const-string v2, "Exception trying to initialize AsyncTask"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid/app/Application;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/base/a/a;->a:Landroid/app/Application;

    return-object v0
.end method

.method protected a(Lcom/facebook/common/process/c;)Z
    .locals 1

    .prologue
    .line 120
    const/4 v0, 0x0

    return v0
.end method

.method public b()Lcom/facebook/config/a/a;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/base/a/a;->d:Lcom/facebook/config/a/a;

    return-object v0
.end method

.method protected abstract b(Lcom/facebook/common/process/c;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/process/c;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/inject/ag;",
            ">;"
        }
    .end annotation
.end method

.method public c()V
    .locals 5

    .prologue
    .line 62
    const-class v0, Lcom/google/common/base/FinalizableReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->setLevel(Ljava/util/logging/Level;)V

    .line 63
    const-wide/16 v0, 0x5

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 64
    const-string v0, "Application startup"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 66
    invoke-direct {p0}, Lcom/facebook/base/a/a;->h()V

    .line 68
    invoke-direct {p0}, Lcom/facebook/base/a/a;->g()Lcom/facebook/common/process/c;

    move-result-object v2

    .line 70
    monitor-enter p0

    .line 72
    :try_start_0
    invoke-virtual {p0, v2}, Lcom/facebook/base/a/a;->a(Lcom/facebook/common/process/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    invoke-virtual {p0}, Lcom/facebook/base/a/a;->d()V

    .line 74
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 77
    :cond_0
    invoke-virtual {p0, v2}, Lcom/facebook/base/a/a;->b(Lcom/facebook/common/process/c;)Ljava/util/List;

    move-result-object v0

    .line 78
    invoke-virtual {p0}, Lcom/facebook/base/a/a;->a()Landroid/app/Application;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;Ljava/util/List;)Lcom/facebook/inject/t;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/a/a;->c:Lcom/facebook/inject/t;

    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 80
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    invoke-virtual {p0, v2}, Lcom/facebook/base/a/a;->c(Lcom/facebook/common/process/c;)V

    .line 82
    iget-object v0, p0, Lcom/facebook/base/a/a;->c:Lcom/facebook/inject/t;

    const-class v3, Lcom/facebook/base/a/k;

    invoke-virtual {v0, v3}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/a/k;

    invoke-virtual {v0}, Lcom/facebook/base/a/k;->a()Lcom/google/common/d/a/s;

    move-result-object v3

    .line 84
    new-instance v4, Lcom/facebook/base/a/b;

    invoke-direct {v4, p0, v1, v2}, Lcom/facebook/base/a/b;-><init>(Lcom/facebook/base/a/a;Lcom/facebook/debug/d/e;Lcom/facebook/common/process/c;)V

    iget-object v0, p0, Lcom/facebook/base/a/a;->c:Lcom/facebook/inject/t;

    const-class v1, Ljava/util/concurrent/Executor;

    const-class v2, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    invoke-static {v3, v4, v0}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 95
    return-void

    .line 80
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected c(Lcom/facebook/common/process/c;)V
    .locals 0

    .prologue
    .line 151
    return-void
.end method

.method protected d()V
    .locals 0

    .prologue
    .line 127
    return-void
.end method

.method public e()V
    .locals 0

    .prologue
    .line 155
    return-void
.end method

.method public final declared-synchronized f()Lcom/facebook/inject/t;
    .locals 2

    .prologue
    .line 161
    monitor-enter p0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/base/a/a;->c:Lcom/facebook/inject/t;

    if-nez v0, :cond_0

    .line 162
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 165
    :catch_0
    move-exception v0

    .line 166
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 164
    :cond_0
    :try_start_2
    iget-object v0, p0, Lcom/facebook/base/a/a;->c:Lcom/facebook/inject/t;
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0
.end method
