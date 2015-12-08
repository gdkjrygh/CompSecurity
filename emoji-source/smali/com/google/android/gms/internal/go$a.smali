.class Lcom/google/android/gms/internal/go$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/go;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic CI:Lcom/google/android/gms/internal/go;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/go;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/go$a;->CI:Lcom/google/android/gms/internal/go;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/go;Lcom/google/android/gms/internal/go$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/go$a;-><init>(Lcom/google/android/gms/internal/go;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/go$a;->CI:Lcom/google/android/gms/internal/go;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/go;->a(Lcom/google/android/gms/internal/go;Z)Z

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/internal/go$a;->CI:Lcom/google/android/gms/internal/go;

    invoke-static {v0}, Lcom/google/android/gms/internal/go;->a(Lcom/google/android/gms/internal/go;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gr;

    const/4 v5, 0x3

    invoke-virtual {v0, v2, v3, v5}, Lcom/google/android/gms/internal/gr;->d(JI)Z

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/google/android/gms/internal/gr;->CN:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/go$a;->CI:Lcom/google/android/gms/internal/go;

    invoke-static {v0}, Lcom/google/android/gms/internal/go;->a(Lcom/google/android/gms/internal/go;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gr;->ev()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_2
    move v1, v0

    goto :goto_1

    :cond_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/go$a;->CI:Lcom/google/android/gms/internal/go;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/go;->b(Lcom/google/android/gms/internal/go;Z)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2
    move v0, v1

    goto :goto_2
.end method
