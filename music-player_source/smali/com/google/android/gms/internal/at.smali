.class public final Lcom/google/android/gms/internal/at;
.super Lcom/google/android/gms/internal/bh;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lcom/google/android/gms/internal/ax;

.field private c:Lcom/google/android/gms/internal/ar;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/bh;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/at;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/at;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/at;->c:Lcom/google/android/gms/internal/ar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/at;->c:Lcom/google/android/gms/internal/ar;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ar;->j()V

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final a(I)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/at;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/at;->b:Lcom/google/android/gms/internal/ax;

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/at;->b:Lcom/google/android/gms/internal/ax;

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ax;->a(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/at;->b:Lcom/google/android/gms/internal/ax;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_1
    const/4 v0, 0x2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final a(Lcom/google/android/gms/internal/ar;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/at;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/at;->c:Lcom/google/android/gms/internal/ar;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final a(Lcom/google/android/gms/internal/ax;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/at;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/at;->b:Lcom/google/android/gms/internal/ax;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final b()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/at;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/at;->c:Lcom/google/android/gms/internal/ar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/at;->c:Lcom/google/android/gms/internal/ar;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ar;->k()V

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final c()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/at;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/at;->c:Lcom/google/android/gms/internal/ar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/at;->c:Lcom/google/android/gms/internal/ar;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ar;->l()V

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final d()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/at;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/at;->c:Lcom/google/android/gms/internal/ar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/at;->c:Lcom/google/android/gms/internal/ar;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ar;->m()V

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final e()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/at;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/at;->b:Lcom/google/android/gms/internal/ax;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/at;->b:Lcom/google/android/gms/internal/ax;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ax;->a(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/at;->b:Lcom/google/android/gms/internal/ax;

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/at;->c:Lcom/google/android/gms/internal/ar;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/at;->c:Lcom/google/android/gms/internal/ar;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ar;->n()V

    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
