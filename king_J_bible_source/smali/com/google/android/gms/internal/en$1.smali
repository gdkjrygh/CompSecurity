.class Lcom/google/android/gms/internal/en$1;
.super Lcom/google/android/gms/internal/eq$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/en;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/cast/CastDevice;JLcom/google/android/gms/cast/Cast$Listener;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zu:Lcom/google/android/gms/internal/en;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/en;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-direct {p0}, Lcom/google/android/gms/internal/eq$a;-><init>()V

    return-void
.end method

.method private D(I)Z
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/en;->dN()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->h(Lcom/google/android/gms/internal/en;)Lcom/google/android/gms/common/api/a$d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->h(Lcom/google/android/gms/internal/en;)Lcom/google/android/gms/common/api/a$d;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/a$d;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/en;->b(Lcom/google/android/gms/internal/en;Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$d;

    const/4 v0, 0x1

    monitor-exit v1

    :goto_0
    return v0

    :cond_0
    monitor-exit v1

    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private b(JI)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->g(Lcom/google/android/gms/internal/en;)Ljava/util/Map;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->g(Lcom/google/android/gms/internal/en;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a$d;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/a$d;->b(Ljava/lang/Object;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public A(I)V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/internal/en;->dM()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->b(Lcom/google/android/gms/internal/en;)Lcom/google/android/gms/common/api/a$d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->b(Lcom/google/android/gms/internal/en;)Lcom/google/android/gms/common/api/a$d;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/en$a;

    new-instance v3, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v3, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/en$a;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/a$d;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/en;->a(Lcom/google/android/gms/internal/en;Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$d;

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

.method public B(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/en$1;->D(I)Z

    return-void
.end method

.method public C(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/en$1;->D(I)Z

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/ApplicationMetadata;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/en;->a(Lcom/google/android/gms/internal/en;Lcom/google/android/gms/cast/ApplicationMetadata;)Lcom/google/android/gms/cast/ApplicationMetadata;

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-virtual {p1}, Lcom/google/android/gms/cast/ApplicationMetadata;->getApplicationId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/en;->a(Lcom/google/android/gms/internal/en;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0, p3}, Lcom/google/android/gms/internal/en;->b(Lcom/google/android/gms/internal/en;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/en;->dM()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->b(Lcom/google/android/gms/internal/en;)Lcom/google/android/gms/common/api/a$d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->b(Lcom/google/android/gms/internal/en;)Lcom/google/android/gms/common/api/a$d;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/internal/en$a;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/en$a;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/cast/ApplicationMetadata;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v7, v0}, Lcom/google/android/gms/common/api/a$d;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/en;->a(Lcom/google/android/gms/internal/en;Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$d;

    :cond_0
    monitor-exit v6

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;J)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, v0}, Lcom/google/android/gms/internal/en$1;->b(JI)V

    return-void
.end method

.method public a(Ljava/lang/String;JI)V
    .locals 0

    invoke-direct {p0, p2, p3, p4}, Lcom/google/android/gms/internal/en$1;->b(JI)V

    return-void
.end method

.method public b(Ljava/lang/String;DZ)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->d(Lcom/google/android/gms/internal/en;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/en$1$2;

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/en$1$2;-><init>(Lcom/google/android/gms/internal/en$1;Ljava/lang/String;DZ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(Ljava/lang/String;[B)V
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/en;->dL()Lcom/google/android/gms/internal/er;

    move-result-object v0

    const-string v1, "IGNORING: Receive (type=binary, ns=%s) <%d bytes>"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    array-length v4, p2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/er;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/internal/en;->dL()Lcom/google/android/gms/internal/er;

    move-result-object v0

    const-string v1, "Receive (type=text, ns=%s) %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/er;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->d(Lcom/google/android/gms/internal/en;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/en$1$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/en$1$3;-><init>(Lcom/google/android/gms/internal/en$1;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onApplicationDisconnected(I)V
    .locals 2
    .param p1, "statusCode"    # I

    .prologue
    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/en;->a(Lcom/google/android/gms/internal/en;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/en;->b(Lcom/google/android/gms/internal/en;Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/en$1;->D(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->c(Lcom/google/android/gms/internal/en;)Lcom/google/android/gms/cast/Cast$Listener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->d(Lcom/google/android/gms/internal/en;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/en$1$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/en$1$1;-><init>(Lcom/google/android/gms/internal/en$1;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public z(I)V
    .locals 5

    const/4 v4, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/en;->dL()Lcom/google/android/gms/internal/er;

    move-result-object v0

    const-string v1, "ICastDeviceControllerListener.onDisconnected: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/er;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0, v4}, Lcom/google/android/gms/internal/en;->a(Lcom/google/android/gms/internal/en;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/en;->a(Lcom/google/android/gms/internal/en;Lcom/google/android/gms/cast/ApplicationMetadata;)Lcom/google/android/gms/cast/ApplicationMetadata;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/en$1;->zu:Lcom/google/android/gms/internal/en;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/en;->N(I)V

    :cond_0
    return-void
.end method
