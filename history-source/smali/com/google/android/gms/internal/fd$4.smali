.class Lcom/google/android/gms/internal/fd$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/fd;->g(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic tF:Lcom/google/android/gms/internal/fd;

.field final synthetic tH:Lcom/google/android/gms/internal/fb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fd;Lcom/google/android/gms/internal/fb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fd$4;->tF:Lcom/google/android/gms/internal/fd;

    iput-object p2, p0, Lcom/google/android/gms/internal/fd$4;->tH:Lcom/google/android/gms/internal/fb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/fd$4;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/fd;->a(Lcom/google/android/gms/internal/fd;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fd$4;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/fd;->c(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/fj;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/fj;->errorCode:I

    const/4 v2, -0x2

    if-eq v0, v2, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fd$4;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/fd;->d(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/gu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dD()Lcom/google/android/gms/internal/gv;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/fd$4;->tF:Lcom/google/android/gms/internal/fd;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/gv$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/fd$4;->tH:Lcom/google/android/gms/internal/fb;

    iget-object v2, p0, Lcom/google/android/gms/internal/fd$4;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v2}, Lcom/google/android/gms/internal/fd;->c(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/fj;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/fb;->b(Lcom/google/android/gms/internal/fj;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
