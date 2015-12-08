.class public final Lcom/google/android/gms/internal/cw;
.super Lcom/google/android/gms/internal/cu;

# interfaces
.implements Lcom/google/android/gms/common/c;
.implements Lcom/google/android/gms/common/d;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ct;

.field private final b:Lcom/google/android/gms/internal/cx;

.field private final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/cd;Lcom/google/android/gms/internal/ct;)V
    .locals 2

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/cu;-><init>(Lcom/google/android/gms/internal/cd;Lcom/google/android/gms/internal/ct;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/cw;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/cw;->a:Lcom/google/android/gms/internal/ct;

    new-instance v0, Lcom/google/android/gms/internal/cx;

    iget-object v1, p2, Lcom/google/android/gms/internal/cd;->l:Lcom/google/android/gms/internal/db;

    iget v1, v1, Lcom/google/android/gms/internal/db;->e:I

    invoke-direct {v0, p1, p0, p0, v1}, Lcom/google/android/gms/internal/cx;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/c;Lcom/google/android/gms/common/d;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cw;->b:Lcom/google/android/gms/internal/cx;

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->b:Lcom/google/android/gms/internal/cx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cx;->d()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/a;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->a:Lcom/google/android/gms/internal/ct;

    new-instance v1, Lcom/google/android/gms/internal/cf;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/cf;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ct;->a(Lcom/google/android/gms/internal/cf;)V

    return-void
.end method

.method public final a_()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->e()V

    return-void
.end method

.method public final b()V
    .locals 1

    const-string v0, "Disconnected from remote ad request service."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/cw;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->b:Lcom/google/android/gms/internal/cx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cx;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->b:Lcom/google/android/gms/internal/cx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cx;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->b:Lcom/google/android/gms/internal/cx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cx;->g()V

    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final d()Lcom/google/android/gms/internal/dc;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/cw;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->b:Lcom/google/android/gms/internal/cx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cx;->c()Lcom/google/android/gms/internal/dc;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
