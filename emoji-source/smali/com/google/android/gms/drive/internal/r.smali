.class public Lcom/google/android/gms/drive/internal/r;
.super Lcom/google/android/gms/internal/hb;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/hb",
        "<",
        "Lcom/google/android/gms/drive/internal/aa;",
        ">;"
    }
.end annotation


# instance fields
.field private final IQ:Ljava/lang/String;

.field private final IR:Landroid/os/Bundle;

.field private IS:Lcom/google/android/gms/drive/DriveId;

.field private IT:Lcom/google/android/gms/drive/DriveId;

.field final IU:Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

.field IV:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/drive/DriveId;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/drive/events/DriveEvent$Listener",
            "<*>;",
            "Lcom/google/android/gms/drive/internal/x",
            "<*>;>;>;"
        }
    .end annotation
.end field

.field private final yQ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/internal/gy;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hb;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/r;->IV:Ljava/util/Map;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/gy;->fj()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Must call Api.ClientBuilder.setAccountName()"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/hm;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/r;->yQ:Ljava/lang/String;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/gy;->fn()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/r;->IQ:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/r;->IU:Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

    iput-object p7, p0, Lcom/google/android/gms/drive/internal/r;->IR:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method protected O(Landroid/os/IBinder;)Lcom/google/android/gms/drive/internal/aa;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/drive/internal/aa$a;->P(Landroid/os/IBinder;)Lcom/google/android/gms/drive/internal/aa;

    move-result-object v0

    return-object v0
.end method

.method a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/DriveEvent$Listener;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lcom/google/android/gms/drive/events/DriveEvent;",
            ">(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/drive/DriveId;",
            "I",
            "Lcom/google/android/gms/drive/events/DriveEvent$Listener",
            "<TC;>;)",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {p3, p2}, Lcom/google/android/gms/drive/events/b;->a(ILcom/google/android/gms/drive/DriveId;)Z

    move-result v0

    const-string v1, "id"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/hm;->b(ZLjava/lang/Object;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Lcom/google/android/gms/internal/hm;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/r;->isConnected()Z

    move-result v0

    const-string v1, "Client must be connected"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/hm;->a(ZLjava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/r;->IV:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->IV:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/r;->IV:Ljava/util/Map;

    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v0, p4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v0, Lcom/google/android/gms/drive/internal/p$k;

    sget-object v2, Lcom/google/android/gms/common/api/Status;->En:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, p1, v2}, Lcom/google/android/gms/drive/internal/p$k;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Status;)V

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_1
    new-instance v2, Lcom/google/android/gms/drive/internal/x;

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/r;->getLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3, p3, p4}, Lcom/google/android/gms/drive/internal/x;-><init>(Landroid/os/Looper;ILcom/google/android/gms/drive/events/DriveEvent$Listener;)V

    invoke-interface {v0, p4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/drive/internal/r$1;

    invoke-direct {v0, p0, p2, p3, v2}, Lcom/google/android/gms/drive/internal/r$1;-><init>(Lcom/google/android/gms/drive/internal/r;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/internal/x;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/a$b;)Lcom/google/android/gms/common/api/a$b;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 1

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v0, "com.google.android.gms.drive.root_id"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/DriveId;

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/r;->IS:Lcom/google/android/gms/drive/DriveId;

    const-string v0, "com.google.android.gms.drive.appdata_id"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/DriveId;

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/r;->IT:Lcom/google/android/gms/drive/DriveId;

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/internal/hb;->a(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/hi;Lcom/google/android/gms/internal/hb$e;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/r;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2}, Lcom/google/android/gms/internal/hm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Lcom/google/android/gms/internal/hm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/r;->fs()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-string v0, "proxy_package_name"

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/r;->IQ:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->IR:Landroid/os/Bundle;

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    const v2, 0x4da6e8

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/r;->fs()[Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/drive/internal/r;->yQ:Ljava/lang/String;

    move-object v0, p1

    move-object v1, p2

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/hi;->a(Lcom/google/android/gms/internal/hh;ILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method b(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/DriveEvent$Listener;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/drive/DriveId;",
            "I",
            "Lcom/google/android/gms/drive/events/DriveEvent$Listener",
            "<*>;)",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {p3, p2}, Lcom/google/android/gms/drive/events/b;->a(ILcom/google/android/gms/drive/DriveId;)Z

    move-result v0

    const-string v1, "id"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/hm;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/r;->isConnected()Z

    move-result v0

    const-string v1, "Client must be connected"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/hm;->a(ZLjava/lang/Object;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Lcom/google/android/gms/internal/hm;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/r;->IV:Ljava/util/Map;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->IV:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/drive/internal/p$k;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->En:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/drive/internal/p$k;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Status;)V

    monitor-exit v2

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {v0, p4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/drive/internal/x;

    if-nez v1, :cond_1

    new-instance v0, Lcom/google/android/gms/drive/internal/p$k;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->En:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/drive/internal/p$k;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Status;)V

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->IV:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    new-instance v0, Lcom/google/android/gms/drive/internal/r$2;

    invoke-direct {v0, p0, p2, p3, v1}, Lcom/google/android/gms/drive/internal/r$2;-><init>(Lcom/google/android/gms/drive/internal/r;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/internal/x;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/a$b;)Lcom/google/android/gms/common/api/a$b;

    move-result-object v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method protected bu()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.drive.ApiService.START"

    return-object v0
.end method

.method protected bv()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.drive.internal.IDriveService"

    return-object v0
.end method

.method public disconnect()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/r;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/aa;

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v1, Lcom/google/android/gms/drive/internal/DisconnectRequest;

    invoke-direct {v1}, Lcom/google/android/gms/drive/internal/DisconnectRequest;-><init>()V

    invoke-interface {v0, v1}, Lcom/google/android/gms/drive/internal/aa;->a(Lcom/google/android/gms/drive/internal/DisconnectRequest;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-super {p0}, Lcom/google/android/gms/internal/hb;->disconnect()V

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->IV:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public gp()Lcom/google/android/gms/drive/internal/aa;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/r;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/aa;

    return-object v0
.end method

.method public gq()Lcom/google/android/gms/drive/DriveId;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->IS:Lcom/google/android/gms/drive/DriveId;

    return-object v0
.end method

.method public gr()Lcom/google/android/gms/drive/DriveId;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->IT:Lcom/google/android/gms/drive/DriveId;

    return-object v0
.end method

.method protected synthetic x(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/r;->O(Landroid/os/IBinder;)Lcom/google/android/gms/drive/internal/aa;

    move-result-object v0

    return-object v0
.end method
