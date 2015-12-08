.class final Lcom/google/android/gms/internal/ii;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ig;

.field final synthetic b:Lcom/google/android/gms/internal/ih;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ih;Lcom/google/android/gms/internal/ig;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ii;->b:Lcom/google/android/gms/internal/ih;

    iput-object p2, p0, Lcom/google/android/gms/internal/ii;->a:Lcom/google/android/gms/internal/ig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ii;->b:Lcom/google/android/gms/internal/ih;

    invoke-static {v0}, Lcom/google/android/gms/internal/ih;->a(Lcom/google/android/gms/internal/ih;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ii;->b:Lcom/google/android/gms/internal/ih;

    invoke-static {v0}, Lcom/google/android/gms/internal/ih;->b(Lcom/google/android/gms/internal/ih;)I

    move-result v0

    const/4 v2, -0x2

    if-eq v0, v2, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ii;->b:Lcom/google/android/gms/internal/ih;

    iget-object v2, p0, Lcom/google/android/gms/internal/ii;->b:Lcom/google/android/gms/internal/ih;

    invoke-static {v2}, Lcom/google/android/gms/internal/ih;->c(Lcom/google/android/gms/internal/ih;)Lcom/google/android/gms/internal/is;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ih;->a(Lcom/google/android/gms/internal/ih;Lcom/google/android/gms/internal/is;)Lcom/google/android/gms/internal/is;

    iget-object v0, p0, Lcom/google/android/gms/internal/ii;->b:Lcom/google/android/gms/internal/ih;

    invoke-static {v0}, Lcom/google/android/gms/internal/ih;->d(Lcom/google/android/gms/internal/ih;)Lcom/google/android/gms/internal/is;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ii;->b:Lcom/google/android/gms/internal/ih;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ih;->a(I)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ii;->a:Lcom/google/android/gms/internal/ig;

    iget-object v2, p0, Lcom/google/android/gms/internal/ii;->b:Lcom/google/android/gms/internal/ih;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ig;->a(Lcom/google/android/gms/internal/ik;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ii;->b:Lcom/google/android/gms/internal/ih;

    iget-object v2, p0, Lcom/google/android/gms/internal/ii;->a:Lcom/google/android/gms/internal/ig;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ih;->a(Lcom/google/android/gms/internal/ih;Lcom/google/android/gms/internal/ig;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
