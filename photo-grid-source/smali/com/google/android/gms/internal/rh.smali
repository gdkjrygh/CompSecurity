.class public final Lcom/google/android/gms/internal/rh;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/util/List;)Lcom/google/android/gms/internal/rl;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/rl",
            "<TV;>;>;)",
            "Lcom/google/android/gms/internal/rl",
            "<",
            "Ljava/util/List",
            "<TV;>;>;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/rf;

    invoke-direct {v1}, Lcom/google/android/gms/internal/rf;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/rl;

    new-instance v5, Lcom/google/android/gms/internal/rj;

    invoke-direct {v5, v3, v2, v1, p0}, Lcom/google/android/gms/internal/rj;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;ILcom/google/android/gms/internal/rf;Ljava/util/List;)V

    invoke-interface {v0, v5}, Lcom/google/android/gms/internal/rl;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-object v1
.end method
