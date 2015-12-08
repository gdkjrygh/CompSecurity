.class Lcom/google/android/gms/internal/fd$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/fd;->f(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic tF:Lcom/google/android/gms/internal/fd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/fd;->a(Lcom/google/android/gms/internal/fd;)Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/fd;->c(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/fj;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/fj;->errorCode:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    monitor-exit v6

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/fd;->d(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/gu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dD()Lcom/google/android/gms/internal/gv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/gv$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/fd;->c(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/fj;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/fj;->errorCode:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Loading URL in WebView: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v1}, Lcom/google/android/gms/internal/fd;->c(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/fj;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/fj;->sg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->V(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/fd;->d(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/gu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v1}, Lcom/google/android/gms/internal/fd;->c(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/fj;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/fj;->sg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gu;->loadUrl(Ljava/lang/String;)V

    :goto_1
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    const-string v0, "Loading HTML in WebView."

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->V(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/fd;->d(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/gu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v1}, Lcom/google/android/gms/internal/fd;->c(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/fj;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/fj;->sg:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/gi;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/fd$3;->tF:Lcom/google/android/gms/internal/fd;

    invoke-static {v2}, Lcom/google/android/gms/internal/fd;->c(Lcom/google/android/gms/internal/fd;)Lcom/google/android/gms/internal/fj;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/fj;->tU:Ljava/lang/String;

    const-string v3, "text/html"

    const-string v4, "UTF-8"

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/gu;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method
