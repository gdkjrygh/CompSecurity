.class public final Lcom/google/android/gms/analytics/f;
.super Lcom/google/android/gms/analytics/o;


# static fields
.field private static b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private c:Z

.field private d:Z

.field private e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z

.field private volatile g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/google/android/gms/analytics/f;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/analytics/internal/aa;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/o;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/f;->e:Ljava/util/Set;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/analytics/f;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/analytics/internal/aa;->a(Landroid/content/Context;)Lcom/google/android/gms/analytics/internal/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->j()Lcom/google/android/gms/analytics/f;

    move-result-object v0

    return-object v0
.end method

.method public static c()V
    .locals 3

    const-class v1, Lcom/google/android/gms/analytics/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/analytics/f;->b:Ljava/util/List;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/analytics/f;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    sput-object v0, Lcom/google/android/gms/analytics/f;->b:Ljava/util/List;

    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/google/android/gms/analytics/l;
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/analytics/l;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/f;->f()Lcom/google/android/gms/analytics/internal/aa;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/analytics/l;-><init>(Lcom/google/android/gms/analytics/internal/aa;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/l;->C()V

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a()V
    .locals 3

    .prologue
    .line 0
    .line 2000
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/f;->f()Lcom/google/android/gms/analytics/internal/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->k()Lcom/google/android/gms/analytics/internal/r;

    move-result-object v0

    .line 1000
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3000
    invoke-static {}, Lcom/google/android/gms/analytics/internal/i;->a()Lcom/google/android/gms/analytics/k;

    move-result-object v1

    .line 1000
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->e()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/analytics/k;->a(I)V

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->i()Z

    move-result v1

    .line 4000
    iput-boolean v1, p0, Lcom/google/android/gms/analytics/f;->f:Z

    .line 1000
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/google/android/gms/analytics/internal/i;->a()Lcom/google/android/gms/analytics/k;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->e()I

    move-result v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/analytics/k;->a(I)V

    .line 0
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/f;->c:Z

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/f;->c:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/f;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/f;->f:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/f;->g:Z

    return v0
.end method
