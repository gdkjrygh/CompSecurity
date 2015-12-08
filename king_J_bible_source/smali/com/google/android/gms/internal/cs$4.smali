.class Lcom/google/android/gms/internal/cs$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/cs;->c(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic oP:Lcom/google/android/gms/internal/cs;

.field final synthetic oR:Lcom/google/android/gms/internal/ct;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/cs;Lcom/google/android/gms/internal/ct;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/cs$4;->oP:Lcom/google/android/gms/internal/cs;

    iput-object p2, p0, Lcom/google/android/gms/internal/cs$4;->oR:Lcom/google/android/gms/internal/ct;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/cs$4;->oP:Lcom/google/android/gms/internal/cs;

    invoke-static {v0}, Lcom/google/android/gms/internal/cs;->a(Lcom/google/android/gms/internal/cs;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cs$4;->oP:Lcom/google/android/gms/internal/cs;

    invoke-static {v0}, Lcom/google/android/gms/internal/cs;->c(Lcom/google/android/gms/internal/cs;)Lcom/google/android/gms/internal/cz;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/cz;->errorCode:I

    const/4 v2, -0x2

    if-eq v0, v2, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cs$4;->oP:Lcom/google/android/gms/internal/cs;

    invoke-static {v0}, Lcom/google/android/gms/internal/cs;->d(Lcom/google/android/gms/internal/cs;)Lcom/google/android/gms/internal/dz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/cs$4;->oP:Lcom/google/android/gms/internal/cs;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ea;->a(Lcom/google/android/gms/internal/ea$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cs$4;->oR:Lcom/google/android/gms/internal/ct;

    iget-object v2, p0, Lcom/google/android/gms/internal/cs$4;->oP:Lcom/google/android/gms/internal/cs;

    invoke-static {v2}, Lcom/google/android/gms/internal/cs;->c(Lcom/google/android/gms/internal/cs;)Lcom/google/android/gms/internal/cz;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ct;->b(Lcom/google/android/gms/internal/cz;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
