.class final Lcom/google/android/gms/internal/ri;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/rf;

.field final synthetic b:Lcom/google/android/gms/internal/rk;

.field final synthetic c:Lcom/google/android/gms/internal/rl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/rf;Lcom/google/android/gms/internal/rk;Lcom/google/android/gms/internal/rl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ri;->a:Lcom/google/android/gms/internal/rf;

    iput-object p2, p0, Lcom/google/android/gms/internal/ri;->b:Lcom/google/android/gms/internal/rk;

    iput-object p3, p0, Lcom/google/android/gms/internal/ri;->c:Lcom/google/android/gms/internal/rl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ri;->a:Lcom/google/android/gms/internal/rf;

    iget-object v1, p0, Lcom/google/android/gms/internal/ri;->b:Lcom/google/android/gms/internal/rk;

    iget-object v2, p0, Lcom/google/android/gms/internal/ri;->c:Lcom/google/android/gms/internal/rl;

    invoke-interface {v2}, Lcom/google/android/gms/internal/rl;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/rk;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/rf;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ri;->a:Lcom/google/android/gms/internal/rf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/rf;->cancel(Z)Z

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1
.end method
