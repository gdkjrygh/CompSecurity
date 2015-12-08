.class Lcom/google/android/gms/internal/dn$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/dn;->f(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic pG:Lcom/google/android/gms/internal/dn;

.field final synthetic pI:Lcom/google/android/gms/internal/do;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/do;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/dn$4;->pG:Lcom/google/android/gms/internal/dn;

    iput-object p2, p0, Lcom/google/android/gms/internal/dn$4;->pI:Lcom/google/android/gms/internal/do;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/dn$4;->pG:Lcom/google/android/gms/internal/dn;

    invoke-static {v0}, Lcom/google/android/gms/internal/dn;->a(Lcom/google/android/gms/internal/dn;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dn$4;->pG:Lcom/google/android/gms/internal/dn;

    invoke-static {v0}, Lcom/google/android/gms/internal/dn;->c(Lcom/google/android/gms/internal/dn;)Lcom/google/android/gms/internal/du;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/du;->errorCode:I

    const/4 v2, -0x2

    if-eq v0, v2, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dn$4;->pG:Lcom/google/android/gms/internal/dn;

    invoke-static {v0}, Lcom/google/android/gms/internal/dn;->d(Lcom/google/android/gms/internal/dn;)Lcom/google/android/gms/internal/ex;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/dn$4;->pG:Lcom/google/android/gms/internal/dn;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/ey$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dn$4;->pI:Lcom/google/android/gms/internal/do;

    iget-object v2, p0, Lcom/google/android/gms/internal/dn$4;->pG:Lcom/google/android/gms/internal/dn;

    invoke-static {v2}, Lcom/google/android/gms/internal/dn;->c(Lcom/google/android/gms/internal/dn;)Lcom/google/android/gms/internal/du;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/do;->b(Lcom/google/android/gms/internal/du;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
