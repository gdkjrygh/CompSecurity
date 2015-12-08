.class public Lcom/google/android/gms/internal/nk;
.super Lcom/google/android/gms/internal/nc;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/nk$c;,
        Lcom/google/android/gms/internal/nk$a;,
        Lcom/google/android/gms/internal/nk$b;
    }
.end annotation


# instance fields
.field private final agX:Lcom/google/android/gms/internal/nj;

.field private final agY:Lcom/google/android/gms/internal/mz;

.field private final agZ:Lcom/google/android/gms/internal/ie;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/nk;-><init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/nk;-><init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/nc;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/nj;

    iget-object v1, p0, Lcom/google/android/gms/internal/nk;->Ee:Lcom/google/android/gms/internal/np;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/nj;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/np;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->Ee:Lcom/google/android/gms/internal/np;

    invoke-static {p1, p7, p8, v0}, Lcom/google/android/gms/internal/mz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/np;)Lcom/google/android/gms/internal/mz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->agY:Lcom/google/android/gms/internal/mz;

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->Ee:Lcom/google/android/gms/internal/np;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ie;->a(Landroid/content/Context;Lcom/google/android/gms/internal/np;)Lcom/google/android/gms/internal/ie;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->agZ:Lcom/google/android/gms/internal/ie;

    return-void
.end method


# virtual methods
.method public S(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/nj;->S(Z)V

    return-void
.end method

.method public a(JLandroid/app/PendingIntent;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->dS()V

    invoke-static {p3}, Lcom/google/android/gms/internal/jx;->i(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-ltz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v2, "detectionIntervalMillis must be >= 0"

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/jx;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->hw()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ni;

    invoke-interface {v0, p1, p2, v1, p3}, Lcom/google/android/gms/internal/ni;->a(JZLandroid/app/PendingIntent;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/app/PendingIntent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->dS()V

    invoke-static {p1}, Lcom/google/android/gms/internal/jx;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->hw()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ni;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ni;->a(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public a(Landroid/app/PendingIntent;Lcom/google/android/gms/location/c$b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->dS()V

    const-string v0, "PendingIntent must be specified."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/jx;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "OnRemoveGeofencesResultListener not provided."

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/jx;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->hw()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ni;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ni;->a(Landroid/app/PendingIntent;Lcom/google/android/gms/internal/nh;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/nk$b;

    invoke-direct {v0, p2, p0}, Lcom/google/android/gms/internal/nk$b;-><init>(Lcom/google/android/gms/location/c$b;Lcom/google/android/gms/internal/nk;)V

    move-object v1, v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Lcom/google/android/gms/location/c$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->dS()V

    const-string v0, "geofencingRequest can\'t be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/jx;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "PendingIntent must be specified."

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/jx;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "OnAddGeofencesResultListener not provided."

    invoke-static {p3, v0}, Lcom/google/android/gms/internal/jx;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p3, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->hw()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ni;

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ni;->a(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/nh;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/nk$b;

    invoke-direct {v0, p3, p0}, Lcom/google/android/gms/internal/nk$b;-><init>(Lcom/google/android/gms/location/c$a;Lcom/google/android/gms/internal/nk;)V

    move-object v1, v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/location/LocationListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/nj;->a(Lcom/google/android/gms/location/LocationListener;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/nj;->a(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/util/List;Lcom/google/android/gms/location/c$b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/location/c$b;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->dS()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "geofenceRequestIds can\'t be null nor empty."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/jx;->b(ZLjava/lang/Object;)V

    const-string v0, "OnRemoveGeofencesResultListener not provided."

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/jx;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-array v0, v1, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    if-nez p2, :cond_1

    const/4 v1, 0x0

    move-object v2, v1

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->hw()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ni;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lcom/google/android/gms/internal/ni;->a([Ljava/lang/String;Lcom/google/android/gms/internal/nh;Ljava/lang/String;)V

    return-void

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/nk$b;

    invoke-direct {v1, p2, p0}, Lcom/google/android/gms/internal/nk$b;-><init>(Lcom/google/android/gms/location/c$b;Lcom/google/android/gms/internal/nk;)V

    move-object v2, v1

    goto :goto_1
.end method

.method public b(Landroid/location/Location;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/nj;->b(Landroid/location/Location;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/nj;->b(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public c(Landroid/app/PendingIntent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/nj;->c(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public disconnect()V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->isConnected()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nj;->removeAllListeners()V

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nj;->nm()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    :goto_0
    :try_start_2
    invoke-super {p0}, Lcom/google/android/gms/internal/nc;->disconnect()V

    monitor-exit v1

    return-void

    :catch_0
    move-exception v0

    const-string v2, "LocationClientImpl"

    const-string v3, "Client disconnected before listeners could be cleaned up"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public nl()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->agX:Lcom/google/android/gms/internal/nj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nj;->nl()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method
