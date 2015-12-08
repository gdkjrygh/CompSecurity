.class public Lcom/google/android/gms/analytics/internal/aa;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/google/android/gms/analytics/internal/aa;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/google/android/gms/internal/wg;

.field private final e:Lcom/google/android/gms/analytics/internal/az;

.field private final f:Lcom/google/android/gms/analytics/internal/j;

.field private final g:Lcom/google/android/gms/c/f;

.field private final h:Lcom/google/android/gms/analytics/internal/s;

.field private final i:Lcom/google/android/gms/analytics/internal/be;

.field private final j:Lcom/google/android/gms/analytics/internal/r;

.field private final k:Lcom/google/android/gms/analytics/internal/n;

.field private final l:Lcom/google/android/gms/analytics/f;

.field private final m:Lcom/google/android/gms/analytics/internal/as;

.field private final n:Lcom/google/android/gms/analytics/internal/b;

.field private final o:Lcom/google/android/gms/analytics/internal/al;

.field private final p:Lcom/google/android/gms/analytics/internal/bd;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/analytics/internal/ac;)V
    .locals 7

    .prologue
    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/ac;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Application context can\'t be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Application;

    const-string v2, "getApplicationContext didn\'t return the application"

    invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/bl;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/ac;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->b:Landroid/content/Context;

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/aa;->c:Landroid/content/Context;

    .line 1000
    invoke-static {}, Lcom/google/android/gms/internal/wh;->d()Lcom/google/android/gms/internal/wg;

    move-result-object v1

    .line 0
    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/aa;->d:Lcom/google/android/gms/internal/wg;

    invoke-static {p0}, Lcom/google/android/gms/analytics/internal/ac;->b(Lcom/google/android/gms/analytics/internal/aa;)Lcom/google/android/gms/analytics/internal/az;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/aa;->e:Lcom/google/android/gms/analytics/internal/az;

    .line 2000
    new-instance v1, Lcom/google/android/gms/analytics/internal/j;

    invoke-direct {v1, p0}, Lcom/google/android/gms/analytics/internal/j;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    .line 0
    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/j;->C()V

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/aa;->f:Lcom/google/android/gms/analytics/internal/j;

    .line 3000
    sget-boolean v1, Lcom/google/android/gms/common/internal/i;->a:Z

    .line 0
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Google Analytics "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/google/android/gms/analytics/internal/z;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is starting up."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/analytics/internal/j;->d(Ljava/lang/String;)V

    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/analytics/internal/ac;->f(Lcom/google/android/gms/analytics/internal/aa;)Lcom/google/android/gms/analytics/internal/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/n;->C()V

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/aa;->k:Lcom/google/android/gms/analytics/internal/n;

    .line 4000
    new-instance v1, Lcom/google/android/gms/analytics/internal/r;

    invoke-direct {v1, p0}, Lcom/google/android/gms/analytics/internal/r;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    .line 0
    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/r;->C()V

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/aa;->j:Lcom/google/android/gms/analytics/internal/r;

    .line 5000
    new-instance v1, Lcom/google/android/gms/analytics/internal/s;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/analytics/internal/s;-><init>(Lcom/google/android/gms/analytics/internal/aa;Lcom/google/android/gms/analytics/internal/ac;)V

    .line 0
    invoke-static {p0}, Lcom/google/android/gms/analytics/internal/ac;->a(Lcom/google/android/gms/analytics/internal/aa;)Lcom/google/android/gms/analytics/internal/as;

    move-result-object v2

    .line 6000
    new-instance v3, Lcom/google/android/gms/analytics/internal/b;

    invoke-direct {v3, p0}, Lcom/google/android/gms/analytics/internal/b;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    .line 7000
    new-instance v4, Lcom/google/android/gms/analytics/internal/al;

    invoke-direct {v4, p0}, Lcom/google/android/gms/analytics/internal/al;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    .line 8000
    new-instance v5, Lcom/google/android/gms/analytics/internal/bd;

    invoke-direct {v5, p0}, Lcom/google/android/gms/analytics/internal/bd;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    .line 9000
    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Landroid/content/Context;)Lcom/google/android/gms/c/f;

    move-result-object v0

    .line 10000
    new-instance v6, Lcom/google/android/gms/analytics/internal/ab;

    invoke-direct {v6, p0}, Lcom/google/android/gms/analytics/internal/ab;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    .line 0
    invoke-virtual {v0, v6}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->g:Lcom/google/android/gms/c/f;

    .line 11000
    new-instance v0, Lcom/google/android/gms/analytics/f;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/f;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    .line 0
    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/as;->C()V

    iput-object v2, p0, Lcom/google/android/gms/analytics/internal/aa;->m:Lcom/google/android/gms/analytics/internal/as;

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/internal/b;->C()V

    iput-object v3, p0, Lcom/google/android/gms/analytics/internal/aa;->n:Lcom/google/android/gms/analytics/internal/b;

    invoke-virtual {v4}, Lcom/google/android/gms/analytics/internal/al;->C()V

    iput-object v4, p0, Lcom/google/android/gms/analytics/internal/aa;->o:Lcom/google/android/gms/analytics/internal/al;

    invoke-virtual {v5}, Lcom/google/android/gms/analytics/internal/bd;->C()V

    iput-object v5, p0, Lcom/google/android/gms/analytics/internal/aa;->p:Lcom/google/android/gms/analytics/internal/bd;

    invoke-static {p0}, Lcom/google/android/gms/analytics/internal/ac;->e(Lcom/google/android/gms/analytics/internal/aa;)Lcom/google/android/gms/analytics/internal/be;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/be;->C()V

    iput-object v2, p0, Lcom/google/android/gms/analytics/internal/aa;->i:Lcom/google/android/gms/analytics/internal/be;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/s;->C()V

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/aa;->h:Lcom/google/android/gms/analytics/internal/s;

    .line 12000
    sget-boolean v2, Lcom/google/android/gms/common/internal/i;->a:Z

    .line 0
    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v2

    const-string v3, "Device AnalyticsService version"

    sget-object v4, Lcom/google/android/gms/analytics/internal/z;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/analytics/internal/j;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/f;->a()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->l:Lcom/google/android/gms/analytics/f;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/s;->b()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Google Analytics "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/google/android/gms/analytics/internal/z;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/analytics/internal/j;->d(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/analytics/internal/aa;
    .locals 8

    invoke-static {p0}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/analytics/internal/aa;->a:Lcom/google/android/gms/analytics/internal/aa;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/analytics/internal/aa;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/analytics/internal/aa;->a:Lcom/google/android/gms/analytics/internal/aa;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/wh;->d()Lcom/google/android/gms/internal/wg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/wg;->b()J

    move-result-wide v2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/analytics/internal/ac;

    invoke-direct {v5, v4}, Lcom/google/android/gms/analytics/internal/ac;-><init>(Landroid/content/Context;)V

    new-instance v4, Lcom/google/android/gms/analytics/internal/aa;

    invoke-direct {v4, v5}, Lcom/google/android/gms/analytics/internal/aa;-><init>(Lcom/google/android/gms/analytics/internal/ac;)V

    sput-object v4, Lcom/google/android/gms/analytics/internal/aa;->a:Lcom/google/android/gms/analytics/internal/aa;

    invoke-static {}, Lcom/google/android/gms/analytics/f;->c()V

    invoke-interface {v0}, Lcom/google/android/gms/internal/wg;->b()J

    move-result-wide v6

    sub-long v2, v6, v2

    sget-object v0, Lcom/google/android/gms/analytics/internal/bh;->Q:Lcom/google/android/gms/analytics/internal/bi;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/bi;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v0, v2, v6

    if-lez v0, :cond_0

    invoke-virtual {v4}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    const-string v4, "Slow initialization (ms)"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v4, v2, v3}, Lcom/google/android/gms/analytics/internal/j;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/analytics/internal/aa;->a:Lcom/google/android/gms/analytics/internal/aa;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private static a(Lcom/google/android/gms/analytics/internal/y;)V
    .locals 2

    const-string v0, "Analytics service not created/initialized"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->A()Z

    move-result v0

    const-string v1, "Analytics service not initialized"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method public static r()V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/c/f;->d()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->b:Landroid/content/Context;

    return-object v0
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->c:Landroid/content/Context;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/wg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->d:Lcom/google/android/gms/internal/wg;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/analytics/internal/az;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->e:Lcom/google/android/gms/analytics/internal/az;

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/analytics/internal/j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->f:Lcom/google/android/gms/analytics/internal/j;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/aa;->a(Lcom/google/android/gms/analytics/internal/y;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->f:Lcom/google/android/gms/analytics/internal/j;

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/analytics/internal/j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->f:Lcom/google/android/gms/analytics/internal/j;

    return-object v0
.end method

.method public final g()Lcom/google/android/gms/c/f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->g:Lcom/google/android/gms/c/f;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->g:Lcom/google/android/gms/c/f;

    return-object v0
.end method

.method public final h()Lcom/google/android/gms/analytics/internal/s;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->h:Lcom/google/android/gms/analytics/internal/s;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/aa;->a(Lcom/google/android/gms/analytics/internal/y;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->h:Lcom/google/android/gms/analytics/internal/s;

    return-object v0
.end method

.method public final i()Lcom/google/android/gms/analytics/internal/be;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->i:Lcom/google/android/gms/analytics/internal/be;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/aa;->a(Lcom/google/android/gms/analytics/internal/y;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->i:Lcom/google/android/gms/analytics/internal/be;

    return-object v0
.end method

.method public final j()Lcom/google/android/gms/analytics/f;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->l:Lcom/google/android/gms/analytics/f;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->l:Lcom/google/android/gms/analytics/f;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/f;->b()Z

    move-result v0

    const-string v1, "Analytics instance not initialized"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->l:Lcom/google/android/gms/analytics/f;

    return-object v0
.end method

.method public final k()Lcom/google/android/gms/analytics/internal/r;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->j:Lcom/google/android/gms/analytics/internal/r;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/aa;->a(Lcom/google/android/gms/analytics/internal/y;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->j:Lcom/google/android/gms/analytics/internal/r;

    return-object v0
.end method

.method public final l()Lcom/google/android/gms/analytics/internal/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->k:Lcom/google/android/gms/analytics/internal/n;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/aa;->a(Lcom/google/android/gms/analytics/internal/y;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->k:Lcom/google/android/gms/analytics/internal/n;

    return-object v0
.end method

.method public final m()Lcom/google/android/gms/analytics/internal/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->k:Lcom/google/android/gms/analytics/internal/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->k:Lcom/google/android/gms/analytics/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/n;->A()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->k:Lcom/google/android/gms/analytics/internal/n;

    goto :goto_0
.end method

.method public final n()Lcom/google/android/gms/analytics/internal/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->n:Lcom/google/android/gms/analytics/internal/b;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/aa;->a(Lcom/google/android/gms/analytics/internal/y;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->n:Lcom/google/android/gms/analytics/internal/b;

    return-object v0
.end method

.method public final o()Lcom/google/android/gms/analytics/internal/as;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->m:Lcom/google/android/gms/analytics/internal/as;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/aa;->a(Lcom/google/android/gms/analytics/internal/y;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->m:Lcom/google/android/gms/analytics/internal/as;

    return-object v0
.end method

.method public final p()Lcom/google/android/gms/analytics/internal/al;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->o:Lcom/google/android/gms/analytics/internal/al;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/aa;->a(Lcom/google/android/gms/analytics/internal/y;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->o:Lcom/google/android/gms/analytics/internal/al;

    return-object v0
.end method

.method public final q()Lcom/google/android/gms/analytics/internal/bd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aa;->p:Lcom/google/android/gms/analytics/internal/bd;

    return-object v0
.end method
