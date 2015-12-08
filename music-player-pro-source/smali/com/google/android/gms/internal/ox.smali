.class public Lcom/google/android/gms/internal/ox;
.super Lcom/google/android/gms/internal/jl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/jl",
        "<",
        "Lcom/google/android/gms/internal/oq;",
        ">;"
    }
.end annotation


# instance fields
.field private final CS:Ljava/lang/String;

.field private final anm:Lcom/google/android/gms/internal/ou;

.field private final ann:Lcom/google/android/gms/internal/os;

.field private ano:Z

.field private final mH:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ou;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0, p1, p2, p2, v0}, Lcom/google/android/gms/internal/jl;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ox;->CS:Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/internal/jx;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ou;

    iput-object v0, p0, Lcom/google/android/gms/internal/ox;->anm:Lcom/google/android/gms/internal/ou;

    iget-object v0, p0, Lcom/google/android/gms/internal/ox;->anm:Lcom/google/android/gms/internal/ou;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ou;->a(Lcom/google/android/gms/internal/ox;)V

    new-instance v0, Lcom/google/android/gms/internal/os;

    invoke-direct {v0}, Lcom/google/android/gms/internal/os;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ox;->ann:Lcom/google/android/gms/internal/os;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ox;->mH:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ox;->ano:Z

    return-void
.end method

.method private c(Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ox;->ann:Lcom/google/android/gms/internal/os;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/os;->a(Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;)V

    return-void
.end method

.method private d(Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;)V
    .locals 2

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ox;->or()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ox;->hw()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/oq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ox;->CS:Ljava/lang/String;

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/internal/oq;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "PlayLoggerImpl"

    const-string v1, "Couldn\'t send log event.  Will try caching."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ox;->c(Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v0, "PlayLoggerImpl"

    const-string v1, "Service was disconnected.  Will try caching."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ox;->c(Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;)V

    goto :goto_0
.end method

.method private or()V
    .locals 7

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ox;->ano:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/je;->K(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ox;->ann:Lcom/google/android/gms/internal/os;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/os;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ox;->ann:Lcom/google/android/gms/internal/os;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/os;->op()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/os$a;

    iget-object v1, v0, Lcom/google/android/gms/internal/os$a;->and:Lcom/google/android/gms/internal/ra$c;

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ox;->hw()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/oq;

    iget-object v5, p0, Lcom/google/android/gms/internal/ox;->CS:Ljava/lang/String;

    iget-object v6, v0, Lcom/google/android/gms/internal/os$a;->anb:Lcom/google/android/gms/internal/ov;

    iget-object v0, v0, Lcom/google/android/gms/internal/os$a;->and:Lcom/google/android/gms/internal/ra$c;

    invoke-static {v0}, Lcom/google/android/gms/internal/qw;->f(Lcom/google/android/gms/internal/qw;)[B

    move-result-object v0

    invoke-interface {v1, v5, v6, v0}, Lcom/google/android/gms/internal/oq;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ov;[B)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v0, "PlayLoggerImpl"

    const-string v1, "Couldn\'t send cached log events to AndroidLog service.  Retaining in memory cache."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_2
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    :try_start_1
    iget-object v1, v0, Lcom/google/android/gms/internal/os$a;->anb:Lcom/google/android/gms/internal/ov;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ov;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lcom/google/android/gms/internal/os$a;->anc:Lcom/google/android/gms/internal/or;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v2

    :goto_3
    move-object v2, v0

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ox;->hw()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/oq;

    iget-object v5, p0, Lcom/google/android/gms/internal/ox;->CS:Ljava/lang/String;

    invoke-interface {v1, v5, v2, v3}, Lcom/google/android/gms/internal/oq;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ov;Ljava/util/List;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    :cond_4
    iget-object v1, v0, Lcom/google/android/gms/internal/os$a;->anb:Lcom/google/android/gms/internal/ov;

    iget-object v0, v0, Lcom/google/android/gms/internal/os$a;->anc:Lcom/google/android/gms/internal/or;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v1

    goto :goto_3

    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ox;->hw()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/oq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ox;->CS:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/oq;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ov;Ljava/util/List;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ox;->ann:Lcom/google/android/gms/internal/os;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/os;->clear()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2
.end method


# virtual methods
.method U(Z)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ox;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ox;->ano:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ox;->ano:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ox;->ano:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ox;->or()V

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

.method protected a(Lcom/google/android/gms/internal/jt;Lcom/google/android/gms/internal/jl$e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const v1, 0x648278

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ox;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2, v0}, Lcom/google/android/gms/internal/jt;->f(Lcom/google/android/gms/internal/js;ILjava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ox;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ox;->ano:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ox;->c(Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;)V

    :goto_0
    monitor-exit v1

    return-void

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ox;->d(Lcom/google/android/gms/internal/ov;Lcom/google/android/gms/internal/or;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected bJ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/oq;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/oq$a;->bI(Landroid/os/IBinder;)Lcom/google/android/gms/internal/oq;

    move-result-object v0

    return-object v0
.end method

.method protected bK()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.playlog.service.START"

    return-object v0
.end method

.method protected bL()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.playlog.internal.IPlayLogService"

    return-object v0
.end method

.method protected synthetic l(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ox;->bJ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/oq;

    move-result-object v0

    return-object v0
.end method

.method public start()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/ox;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ox;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ox;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    monitor-exit v1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ox;->anm:Lcom/google/android/gms/internal/ou;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ou;->T(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ox;->connect()V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public stop()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/ox;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ox;->anm:Lcom/google/android/gms/internal/ou;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ou;->T(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ox;->disconnect()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
