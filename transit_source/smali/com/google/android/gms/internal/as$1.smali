.class Lcom/google/android/gms/internal/as$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/as;->b(JJ)Lcom/google/android/gms/internal/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic fj:Lcom/google/android/gms/internal/ar;

.field final synthetic fk:Lcom/google/android/gms/internal/as;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/as;Lcom/google/android/gms/internal/ar;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/as$1;->fk:Lcom/google/android/gms/internal/as;

    iput-object p2, p0, Lcom/google/android/gms/internal/as$1;->fj:Lcom/google/android/gms/internal/ar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/as$1;->fk:Lcom/google/android/gms/internal/as;

    invoke-static {v0}, Lcom/google/android/gms/internal/as;->a(Lcom/google/android/gms/internal/as;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/as$1;->fk:Lcom/google/android/gms/internal/as;

    invoke-static {v0}, Lcom/google/android/gms/internal/as;->b(Lcom/google/android/gms/internal/as;)I

    move-result v0

    const/4 v2, -0x2

    if-eq v0, v2, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/as$1;->fk:Lcom/google/android/gms/internal/as;

    iget-object v2, p0, Lcom/google/android/gms/internal/as$1;->fk:Lcom/google/android/gms/internal/as;

    invoke-static {v2}, Lcom/google/android/gms/internal/as;->c(Lcom/google/android/gms/internal/as;)Lcom/google/android/gms/internal/ax;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/as;->a(Lcom/google/android/gms/internal/as;Lcom/google/android/gms/internal/ax;)Lcom/google/android/gms/internal/ax;

    iget-object v0, p0, Lcom/google/android/gms/internal/as$1;->fk:Lcom/google/android/gms/internal/as;

    invoke-static {v0}, Lcom/google/android/gms/internal/as;->d(Lcom/google/android/gms/internal/as;)Lcom/google/android/gms/internal/ax;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/as$1;->fk:Lcom/google/android/gms/internal/as;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/as;->d(I)V

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
    iget-object v0, p0, Lcom/google/android/gms/internal/as$1;->fj:Lcom/google/android/gms/internal/ar;

    iget-object v2, p0, Lcom/google/android/gms/internal/as$1;->fk:Lcom/google/android/gms/internal/as;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ar;->a(Lcom/google/android/gms/internal/at$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/as$1;->fk:Lcom/google/android/gms/internal/as;

    iget-object v2, p0, Lcom/google/android/gms/internal/as$1;->fj:Lcom/google/android/gms/internal/ar;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/as;->a(Lcom/google/android/gms/internal/as;Lcom/google/android/gms/internal/ar;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
