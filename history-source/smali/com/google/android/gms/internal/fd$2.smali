.class Lcom/google/android/gms/internal/fd$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/fd;->cx()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic tF:Lcom/google/android/gms/internal/fd;

.field final synthetic tG:Lcom/google/android/gms/internal/fy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fd;Lcom/google/android/gms/internal/fy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fd$2;->tF:Lcom/google/android/gms/internal/fd;

    iput-object p2, p0, Lcom/google/android/gms/internal/fd$2;->tG:Lcom/google/android/gms/internal/fy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/fd$2;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/fd;->a(Lcom/google/android/gms/internal/fd;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fd$2;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/fd;->b(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/fc$a;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/fd$2;->tG:Lcom/google/android/gms/internal/fy;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/fc$a;->a(Lcom/google/android/gms/internal/fy;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
