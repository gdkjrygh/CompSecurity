.class final Lcom/google/android/gms/internal/av;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/at;

.field final synthetic b:Lcom/google/android/gms/internal/au;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/au;Lcom/google/android/gms/internal/at;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/av;->b:Lcom/google/android/gms/internal/au;

    iput-object p2, p0, Lcom/google/android/gms/internal/av;->a:Lcom/google/android/gms/internal/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->b:Lcom/google/android/gms/internal/au;

    invoke-static {v0}, Lcom/google/android/gms/internal/au;->a(Lcom/google/android/gms/internal/au;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/av;->b:Lcom/google/android/gms/internal/au;

    invoke-static {v0}, Lcom/google/android/gms/internal/au;->b(Lcom/google/android/gms/internal/au;)I

    move-result v0

    const/4 v2, -0x2

    if-eq v0, v2, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/av;->b:Lcom/google/android/gms/internal/au;

    iget-object v2, p0, Lcom/google/android/gms/internal/av;->b:Lcom/google/android/gms/internal/au;

    invoke-static {v2}, Lcom/google/android/gms/internal/au;->c(Lcom/google/android/gms/internal/au;)Lcom/google/android/gms/internal/bd;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/au;->a(Lcom/google/android/gms/internal/au;Lcom/google/android/gms/internal/bd;)Lcom/google/android/gms/internal/bd;

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->b:Lcom/google/android/gms/internal/au;

    invoke-static {v0}, Lcom/google/android/gms/internal/au;->d(Lcom/google/android/gms/internal/au;)Lcom/google/android/gms/internal/bd;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->b:Lcom/google/android/gms/internal/au;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/au;->a(I)V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/av;->a:Lcom/google/android/gms/internal/at;

    iget-object v2, p0, Lcom/google/android/gms/internal/av;->b:Lcom/google/android/gms/internal/au;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/at;->a(Lcom/google/android/gms/internal/ax;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->b:Lcom/google/android/gms/internal/au;

    iget-object v2, p0, Lcom/google/android/gms/internal/av;->a:Lcom/google/android/gms/internal/at;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/au;->a(Lcom/google/android/gms/internal/au;Lcom/google/android/gms/internal/at;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
