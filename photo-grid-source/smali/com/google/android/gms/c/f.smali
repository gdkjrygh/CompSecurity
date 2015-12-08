.class public final Lcom/google/android/gms/c/f;
.super Ljava/lang/Object;


# static fields
.field private static volatile a:Lcom/google/android/gms/c/f;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/c/a;

.field private final e:Lcom/google/android/gms/c/h;

.field private volatile f:Lcom/google/android/gms/internal/wu;

.field private g:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/c/f;->b:Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/c/h;

    invoke-direct {v0, p0}, Lcom/google/android/gms/c/h;-><init>(Lcom/google/android/gms/c/f;)V

    iput-object v0, p0, Lcom/google/android/gms/c/f;->e:Lcom/google/android/gms/c/h;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/c/f;->c:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/c/a;

    invoke-direct {v0}, Lcom/google/android/gms/c/a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/c/f;->d:Lcom/google/android/gms/c/a;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/c/f;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/c/f;->a:Lcom/google/android/gms/c/f;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/c/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/c/f;->a:Lcom/google/android/gms/c/f;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/c/f;

    invoke-direct {v0, p0}, Lcom/google/android/gms/c/f;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/google/android/gms/c/f;->a:Lcom/google/android/gms/c/f;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/c/f;->a:Lcom/google/android/gms/c/f;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/google/android/gms/c/f;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/c/f;->c:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/c/f;)Ljava/lang/Thread$UncaughtExceptionHandler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/c/f;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/c/c;)V
    .locals 5

    .prologue
    .line 0
    .line 3000
    const-string v0, "deliver should be called from worker thread"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->c(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/c/c;->f()Z

    move-result v0

    const-string v1, "Measurement must be submitted"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/c/c;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/c/l;

    invoke-interface {v0}, Lcom/google/android/gms/c/l;->a()Landroid/net/Uri;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, p0}, Lcom/google/android/gms/c/l;->a(Lcom/google/android/gms/c/c;)V

    goto :goto_0

    .line 0
    :cond_1
    return-void
.end method

.method public static d()V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/gms/c/k;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call expected from worker thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/wu;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/c/f;->f:Lcom/google/android/gms/internal/wu;

    if-nez v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/c/f;->f:Lcom/google/android/gms/internal/wu;

    if-nez v0, :cond_2

    new-instance v2, Lcom/google/android/gms/internal/wu;

    invoke-direct {v2}, Lcom/google/android/gms/internal/wu;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/c/f;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/c/f;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/wu;->c(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/wu;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    :try_start_1
    iget-object v4, p0, Lcom/google/android/gms/c/f;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v5, v4, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v3, v5}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object v0, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :goto_0
    :try_start_2
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/wu;->a(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/wu;->b(Ljava/lang/String;)V

    iput-object v2, p0, Lcom/google/android/gms/c/f;->f:Lcom/google/android/gms/internal/wu;

    :cond_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/c/f;->f:Lcom/google/android/gms/internal/wu;

    return-object v0

    :catch_0
    move-exception v3

    :try_start_3
    const-string v3, "GAv4"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error retrieving package info: appName set to "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final a(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TV;>;)",
            "Ljava/util/concurrent/Future",
            "<TV;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/gms/c/k;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/concurrent/FutureTask;

    invoke-direct {v0, p1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->run()V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/c/f;->e:Lcom/google/android/gms/c/h;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/c/h;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    goto :goto_0
.end method

.method final a(Lcom/google/android/gms/c/c;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/c/c;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Measurement prototype can\'t be submitted"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/c/c;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Measurement can only be submitted once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/c/c;->a()Lcom/google/android/gms/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/c/c;->g()V

    iget-object v1, p0, Lcom/google/android/gms/c/f;->e:Lcom/google/android/gms/c/h;

    new-instance v2, Lcom/google/android/gms/c/g;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/c/g;-><init>(Lcom/google/android/gms/c/f;Lcom/google/android/gms/c/c;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/c/h;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/c/f;->e:Lcom/google/android/gms/c/h;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/c/h;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final a(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/c/f;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method

.method public final b()Lcom/google/android/gms/internal/ww;
    .locals 3

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/c/f;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ww;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ww;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ww;->a(Ljava/lang/String;)V

    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1000
    iput v2, v1, Lcom/google/android/gms/internal/ww;->b:I

    .line 0
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 2000
    iput v0, v1, Lcom/google/android/gms/internal/ww;->c:I

    .line 0
    return-object v1
.end method

.method public final c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/c/f;->b:Landroid/content/Context;

    return-object v0
.end method
