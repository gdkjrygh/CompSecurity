.class public final Lcom/google/android/gms/internal/vd;
.super Lcom/google/android/gms/common/api/y;

# interfaces
.implements Lcom/google/android/gms/common/api/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/r;",
        ">",
        "Lcom/google/android/gms/common/api/y",
        "<TR;>;",
        "Lcom/google/android/gms/common/api/s",
        "<TR;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/common/api/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/v",
            "<-TR;+",
            "Lcom/google/android/gms/common/api/r;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/google/android/gms/internal/vd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/vd",
            "<+",
            "Lcom/google/android/gms/common/api/r;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/common/api/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/t",
            "<-TR;>;"
        }
    .end annotation
.end field

.field private d:Lcom/google/android/gms/common/api/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/p",
            "<TR;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/Object;


# direct methods
.method private a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .prologue
    .line 0
    iget-object v1, p0, Lcom/google/android/gms/internal/vd;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vd;->a:Lcom/google/android/gms/common/api/v;

    if-eqz v0, :cond_0

    const-string v0, "onFailure must not return null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/vd;->b:Lcom/google/android/gms/internal/vd;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/vd;->a(Lcom/google/android/gms/common/api/Status;)V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static b(Lcom/google/android/gms/common/api/r;)V
    .locals 5

    instance-of v1, p0, Lcom/google/android/gms/common/api/q;

    if-eqz v1, :cond_0

    :try_start_0
    move-object v0, p0

    check-cast v0, Lcom/google/android/gms/common/api/q;

    move-object v1, v0

    invoke-interface {v1}, Lcom/google/android/gms/common/api/q;->b()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v1

    const-string v2, "TransformedResultImpl"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unable to release "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/r;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    .prologue
    .line 0
    iget-object v1, p0, Lcom/google/android/gms/internal/vd;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/common/api/r;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/vd;->a:Lcom/google/android/gms/common/api/v;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/vd;->a:Lcom/google/android/gms/common/api/v;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/v;->a()Lcom/google/android/gms/common/api/p;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0xd

    const-string v3, "Transform returned null"

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vd;->a(Lcom/google/android/gms/common/api/Status;)V

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/vd;->b(Lcom/google/android/gms/common/api/r;)V

    :cond_0
    :goto_1
    monitor-exit v1

    return-void

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/vd;->b:Lcom/google/android/gms/internal/vd;

    .line 1000
    iget-object v3, v2, Lcom/google/android/gms/internal/vd;->e:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iput-object v0, v2, Lcom/google/android/gms/internal/vd;->d:Lcom/google/android/gms/common/api/p;

    .line 2000
    iget-object v0, v2, Lcom/google/android/gms/internal/vd;->d:Lcom/google/android/gms/common/api/p;

    if-eqz v0, :cond_2

    iget-object v0, v2, Lcom/google/android/gms/internal/vd;->a:Lcom/google/android/gms/common/api/v;

    if-nez v0, :cond_3

    iget-object v0, v2, Lcom/google/android/gms/internal/vd;->c:Lcom/google/android/gms/common/api/t;

    if-nez v0, :cond_3

    .line 1000
    :cond_2
    :goto_2
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0

    .line 0
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 2000
    :cond_3
    :try_start_3
    iget-object v0, v2, Lcom/google/android/gms/internal/vd;->d:Lcom/google/android/gms/common/api/p;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/p;->a(Lcom/google/android/gms/common/api/s;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    .line 0
    :cond_4
    :try_start_4
    iget-object v0, p0, Lcom/google/android/gms/internal/vd;->c:Lcom/google/android/gms/common/api/t;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_5
    invoke-interface {p1}, Lcom/google/android/gms/common/api/r;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vd;->a(Lcom/google/android/gms/common/api/Status;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/vd;->b(Lcom/google/android/gms/common/api/r;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1
.end method
