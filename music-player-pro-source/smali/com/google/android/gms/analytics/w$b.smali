.class Lcom/google/android/gms/analytics/w$b;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/analytics/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic zv:Lcom/google/android/gms/analytics/w;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/analytics/w;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/w$b;->zv:Lcom/google/android/gms/analytics/w;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/analytics/w;Lcom/google/android/gms/analytics/w$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/w$b;-><init>(Lcom/google/android/gms/analytics/w;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/analytics/w$b;->zv:Lcom/google/android/gms/analytics/w;

    invoke-static {v0}, Lcom/google/android/gms/analytics/w;->b(Lcom/google/android/gms/analytics/w;)Lcom/google/android/gms/analytics/w$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/w$a;->zy:Lcom/google/android/gms/analytics/w$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/w$b;->zv:Lcom/google/android/gms/analytics/w;

    invoke-static {v0}, Lcom/google/android/gms/analytics/w;->e(Lcom/google/android/gms/analytics/w;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/w$b;->zv:Lcom/google/android/gms/analytics/w;

    invoke-static {v0}, Lcom/google/android/gms/analytics/w;->f(Lcom/google/android/gms/analytics/w;)J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/analytics/w$b;->zv:Lcom/google/android/gms/analytics/w;

    invoke-static {v2}, Lcom/google/android/gms/analytics/w;->g(Lcom/google/android/gms/analytics/w;)J

    move-result-wide v2

    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/google/android/gms/analytics/w$b;->zv:Lcom/google/android/gms/analytics/w;

    invoke-static {v2}, Lcom/google/android/gms/analytics/w;->h(Lcom/google/android/gms/analytics/w;)Lcom/google/android/gms/internal/ld;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/ld;->elapsedRealtime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const-string v0, "Disconnecting due to inactivity"

    invoke-static {v0}, Lcom/google/android/gms/analytics/ae;->V(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/w$b;->zv:Lcom/google/android/gms/analytics/w;

    invoke-static {v0}, Lcom/google/android/gms/analytics/w;->i(Lcom/google/android/gms/analytics/w;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/w$b;->zv:Lcom/google/android/gms/analytics/w;

    invoke-static {v0}, Lcom/google/android/gms/analytics/w;->j(Lcom/google/android/gms/analytics/w;)Ljava/util/Timer;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/analytics/w$b;

    iget-object v2, p0, Lcom/google/android/gms/analytics/w$b;->zv:Lcom/google/android/gms/analytics/w;

    invoke-direct {v1, v2}, Lcom/google/android/gms/analytics/w$b;-><init>(Lcom/google/android/gms/analytics/w;)V

    iget-object v2, p0, Lcom/google/android/gms/analytics/w$b;->zv:Lcom/google/android/gms/analytics/w;

    invoke-static {v2}, Lcom/google/android/gms/analytics/w;->g(Lcom/google/android/gms/analytics/w;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    goto :goto_0
.end method
