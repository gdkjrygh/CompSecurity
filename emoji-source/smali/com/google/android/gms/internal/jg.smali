.class public Lcom/google/android/gms/internal/jg;
.super Lcom/google/android/gms/internal/hb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/jg$1;,
        Lcom/google/android/gms/internal/jg$d;,
        Lcom/google/android/gms/internal/jg$a;,
        Lcom/google/android/gms/internal/jg$b;,
        Lcom/google/android/gms/internal/jg$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/hb",
        "<",
        "Lcom/google/android/gms/internal/je;",
        ">;"
    }
.end annotation


# instance fields
.field private final VJ:Lcom/google/android/gms/internal/jj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/jj",
            "<",
            "Lcom/google/android/gms/internal/je;",
            ">;"
        }
    .end annotation
.end field

.field private final VP:Lcom/google/android/gms/internal/jf;

.field private final VQ:Lcom/google/android/gms/internal/jz;

.field private final VR:Lcom/google/android/gms/internal/iz;

.field private final VS:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;)V
    .locals 8

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/jg;-><init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v0, 0x0

    new-array v5, v0, [Ljava/lang/String;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hb;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/jg$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/jg$c;-><init>(Lcom/google/android/gms/internal/jg;Lcom/google/android/gms/internal/jg$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jg;->VJ:Lcom/google/android/gms/internal/jj;

    new-instance v0, Lcom/google/android/gms/internal/jf;

    iget-object v1, p0, Lcom/google/android/gms/internal/jg;->VJ:Lcom/google/android/gms/internal/jj;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/jf;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/jj;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    iput-object p6, p0, Lcom/google/android/gms/internal/jg;->VS:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/jz;

    iget-object v1, p0, Lcom/google/android/gms/internal/jg;->VJ:Lcom/google/android/gms/internal/jj;

    invoke-direct {v0, p3, v1}, Lcom/google/android/gms/internal/jz;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/jj;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jg;->VQ:Lcom/google/android/gms/internal/jz;

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->VJ:Lcom/google/android/gms/internal/jj;

    invoke-static {p1, p7, v0}, Lcom/google/android/gms/internal/iz;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/jj;)Lcom/google/android/gms/internal/iz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/jg;->VR:Lcom/google/android/gms/internal/iz;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;Ljava/lang/String;)V
    .locals 4

    const/4 v3, 0x0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/hb;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/jg$c;

    invoke-direct {v0, p0, v3}, Lcom/google/android/gms/internal/jg$c;-><init>(Lcom/google/android/gms/internal/jg;Lcom/google/android/gms/internal/jg$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jg;->VJ:Lcom/google/android/gms/internal/jj;

    new-instance v0, Lcom/google/android/gms/internal/jf;

    iget-object v1, p0, Lcom/google/android/gms/internal/jg;->VJ:Lcom/google/android/gms/internal/jj;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/jf;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/jj;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    iput-object p4, p0, Lcom/google/android/gms/internal/jg;->VS:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/jz;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/jg;->VJ:Lcom/google/android/gms/internal/jj;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/jz;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/jj;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jg;->VQ:Lcom/google/android/gms/internal/jz;

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->VJ:Lcom/google/android/gms/internal/jj;

    invoke-static {p1, v3, v0}, Lcom/google/android/gms/internal/iz;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/jj;)Lcom/google/android/gms/internal/iz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/jg;->VR:Lcom/google/android/gms/internal/iz;

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/jg;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->cn()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/hi;Lcom/google/android/gms/internal/hb$e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "client_name"

    iget-object v2, p0, Lcom/google/android/gms/internal/jg;->VS:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const v1, 0x4da6e8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2, v0}, Lcom/google/android/gms/internal/hi;->e(Lcom/google/android/gms/internal/hh;ILjava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public addGeofences(Ljava/util/List;Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;)V
    .locals 3
    .param p2, "pendingIntent"    # Landroid/app/PendingIntent;
    .param p3, "listener"    # Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/jh;",
            ">;",
            "Landroid/app/PendingIntent;",
            "Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .local p1, "geofences":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/internal/jh;>;"
    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->cn()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "At least one geofence must be specified."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/hm;->b(ZLjava/lang/Object;)V

    const-string v0, "PendingIntent must be specified."

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/hm;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "OnAddGeofencesResultListener not provided."

    invoke-static {p3, v0}, Lcom/google/android/gms/internal/hm;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p3, :cond_1

    const/4 v0, 0x0

    move-object v1, v0

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/je;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p1, p2, v1, v2}, Lcom/google/android/gms/internal/je;->a(Ljava/util/List;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/jd;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/jg$b;

    invoke-direct {v0, p3, p0}, Lcom/google/android/gms/internal/jg$b;-><init>(Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;Lcom/google/android/gms/internal/jg;)V

    move-object v1, v0

    goto :goto_1
.end method

.method protected at(Landroid/os/IBinder;)Lcom/google/android/gms/internal/je;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/je$a;->as(Landroid/os/IBinder;)Lcom/google/android/gms/internal/je;

    move-result-object v0

    return-object v0
.end method

.method protected bu()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"

    return-object v0
.end method

.method protected bv()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    return-object v0
.end method

.method public disconnect()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jf;->removeAllListeners()V

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jf;->iY()V

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/internal/hb;->disconnect()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getLastLocation()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jf;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public removeActivityUpdates(Landroid/app/PendingIntent;)V
    .locals 1
    .param p1, "callbackIntent"    # Landroid/app/PendingIntent;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->cn()V

    invoke-static {p1}, Lcom/google/android/gms/internal/hm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/je;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/je;->removeActivityUpdates(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public removeGeofences(Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V
    .locals 3
    .param p1, "pendingIntent"    # Landroid/app/PendingIntent;
    .param p2, "listener"    # Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->cn()V

    const-string v0, "PendingIntent must be specified."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/hm;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "OnRemoveGeofencesResultListener not provided."

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/hm;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/je;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/je;->a(Landroid/app/PendingIntent;Lcom/google/android/gms/internal/jd;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/jg$b;

    invoke-direct {v0, p2, p0}, Lcom/google/android/gms/internal/jg$b;-><init>(Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;Lcom/google/android/gms/internal/jg;)V

    move-object v1, v0

    goto :goto_0
.end method

.method public removeGeofences(Ljava/util/List;Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V
    .locals 4
    .param p2, "listener"    # Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .local p1, "geofenceRequestIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->cn()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "geofenceRequestIds can\'t be null nor empty."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/hm;->b(ZLjava/lang/Object;)V

    const-string v0, "OnRemoveGeofencesResultListener not provided."

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/hm;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-array v0, v1, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    if-nez p2, :cond_1

    const/4 v1, 0x0

    move-object v2, v1

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->ft()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/je;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lcom/google/android/gms/internal/je;->a([Ljava/lang/String;Lcom/google/android/gms/internal/jd;Ljava/lang/String;)V

    return-void

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/jg$b;

    invoke-direct {v1, p2, p0}, Lcom/google/android/gms/internal/jg$b;-><init>(Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;Lcom/google/android/gms/internal/jg;)V

    move-object v2, v1

    goto :goto_1
.end method

.method public removeLocationUpdates(Landroid/app/PendingIntent;)V
    .locals 1
    .param p1, "callbackIntent"    # Landroid/app/PendingIntent;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jf;->removeLocationUpdates(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public removeLocationUpdates(Lcom/google/android/gms/location/LocationListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/location/LocationListener;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jf;->removeLocationUpdates(Lcom/google/android/gms/location/LocationListener;)V

    return-void
.end method

.method public requestActivityUpdates(JLandroid/app/PendingIntent;)V
    .locals 5
    .param p1, "detectionIntervalMillis"    # J
    .param p3, "callbackIntent"    # Landroid/app/PendingIntent;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->cn()V

    invoke-static {p3}, Lcom/google/android/gms/internal/hm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-ltz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v2, "detectionIntervalMillis must be >= 0"

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/hm;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/je;

    invoke-interface {v0, p1, p2, v1, p3}, Lcom/google/android/gms/internal/je;->a(JZLandroid/app/PendingIntent;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V
    .locals 1
    .param p1, "request"    # Lcom/google/android/gms/location/LocationRequest;
    .param p2, "callbackIntent"    # Landroid/app/PendingIntent;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/jf;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)V
    .locals 1
    .param p1, "request"    # Lcom/google/android/gms/location/LocationRequest;
    .param p2, "listener"    # Lcom/google/android/gms/location/LocationListener;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jg;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V

    return-void
.end method

.method public requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    .locals 2
    .param p1, "request"    # Lcom/google/android/gms/location/LocationRequest;
    .param p2, "listener"    # Lcom/google/android/gms/location/LocationListener;
    .param p3, "looper"    # Landroid/os/Looper;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v1, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/jf;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setMockLocation(Landroid/location/Location;)V
    .locals 1
    .param p1, "mockLocation"    # Landroid/location/Location;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jf;->setMockLocation(Landroid/location/Location;)V

    return-void
.end method

.method public setMockMode(Z)V
    .locals 1
    .param p1, "isMockMode"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->VP:Lcom/google/android/gms/internal/jf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jf;->setMockMode(Z)V

    return-void
.end method

.method protected synthetic x(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/jg;->at(Landroid/os/IBinder;)Lcom/google/android/gms/internal/je;

    move-result-object v0

    return-object v0
.end method
