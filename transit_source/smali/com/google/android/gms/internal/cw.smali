.class public final Lcom/google/android/gms/internal/cw;
.super Lcom/google/android/gms/internal/de;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/cw$h;,
        Lcom/google/android/gms/internal/cw$b;,
        Lcom/google/android/gms/internal/cw$d;,
        Lcom/google/android/gms/internal/cw$f;,
        Lcom/google/android/gms/internal/cw$g;,
        Lcom/google/android/gms/internal/cw$a;,
        Lcom/google/android/gms/internal/cw$c;,
        Lcom/google/android/gms/internal/cw$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/cy;",
        ">;"
    }
.end annotation


# instance fields
.field private final it:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1, p2, p3, p5}, Lcom/google/android/gms/internal/de;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    invoke-static {p4}, Lcom/google/android/gms/internal/dm;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/cw;->it:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/appstate/OnStateLoadedListener;I[B)V
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cy;

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/internal/cy;->a(Lcom/google/android/gms/internal/cx;I[B)V

    :goto_1
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/cw$e;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/cw$e;-><init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnStateLoadedListener;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "AppStateClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method protected a(Lcom/google/android/gms/internal/dj;Lcom/google/android/gms/internal/de$d;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v2, 0x3d8024

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/cw;->it:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->aY()[Ljava/lang/String;

    move-result-object v5

    move-object v0, p1

    move-object v1, p2

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/dj;->a(Lcom/google/android/gms/internal/di;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method protected varargs a([Ljava/lang/String;)V
    .locals 6

    const/4 v3, 0x1

    const/4 v1, 0x0

    move v0, v1

    move v2, v1

    :goto_0
    array-length v4, p1

    if-ge v0, v4, :cond_1

    aget-object v4, p1, v0

    const-string v5, "https://www.googleapis.com/auth/appstate"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v2, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const-string v0, "AppStateClient requires %s to function."

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "https://www.googleapis.com/auth/appstate"

    aput-object v4, v3, v1

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/dm;->a(ZLjava/lang/Object;)V

    return-void
.end method

.method protected ag()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.appstate.service.START"

    return-object v0
.end method

.method protected ah()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.appstate.internal.IAppStateService"

    return-object v0
.end method

.method public deleteState(Lcom/google/android/gms/appstate/OnStateDeletedListener;I)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/appstate/OnStateDeletedListener;
    .param p2, "stateKey"    # I

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cy;

    new-instance v1, Lcom/google/android/gms/internal/cw$a;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/cw$a;-><init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnStateDeletedListener;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/cy;->b(Lcom/google/android/gms/internal/cx;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "AppStateClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public getMaxNumKeys()I
    .locals 3

    const/4 v1, 0x2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/cy;->getMaxNumKeys()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "AppStateClient"

    const-string v2, "service died"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v1

    goto :goto_0
.end method

.method public getMaxStateSize()I
    .locals 3

    const/4 v1, 0x2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/cy;->getMaxStateSize()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "AppStateClient"

    const-string v2, "service died"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v1

    goto :goto_0
.end method

.method public listStates(Lcom/google/android/gms/appstate/OnStateListLoadedListener;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/appstate/OnStateListLoadedListener;

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cy;

    new-instance v1, Lcom/google/android/gms/internal/cw$c;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/cw$c;-><init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnStateListLoadedListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/cy;->a(Lcom/google/android/gms/internal/cx;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "AppStateClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public loadState(Lcom/google/android/gms/appstate/OnStateLoadedListener;I)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/appstate/OnStateLoadedListener;
    .param p2, "stateKey"    # I

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cy;

    new-instance v1, Lcom/google/android/gms/internal/cw$e;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/cw$e;-><init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnStateLoadedListener;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/cy;->a(Lcom/google/android/gms/internal/cx;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "AppStateClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method protected synthetic p(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/cw;->r(Landroid/os/IBinder;)Lcom/google/android/gms/internal/cy;

    move-result-object v0

    return-object v0
.end method

.method protected r(Landroid/os/IBinder;)Lcom/google/android/gms/internal/cy;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/cy$a;->t(Landroid/os/IBinder;)Lcom/google/android/gms/internal/cy;

    move-result-object v0

    return-object v0
.end method

.method public resolveState(Lcom/google/android/gms/appstate/OnStateLoadedListener;ILjava/lang/String;[B)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/appstate/OnStateLoadedListener;
    .param p2, "stateKey"    # I
    .param p3, "resolvedVersion"    # Ljava/lang/String;
    .param p4, "resolvedData"    # [B

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cy;

    new-instance v1, Lcom/google/android/gms/internal/cw$e;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/cw$e;-><init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnStateLoadedListener;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/internal/cy;->a(Lcom/google/android/gms/internal/cx;ILjava/lang/String;[B)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "AppStateClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public signOut(Lcom/google/android/gms/appstate/OnSignOutCompleteListener;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/appstate/OnSignOutCompleteListener;

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->bd()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cy;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/cy;->b(Lcom/google/android/gms/internal/cx;)V

    :goto_1
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/cw$g;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/cw$g;-><init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnSignOutCompleteListener;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "AppStateClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method
