.class public Lcom/google/android/gms/internal/fx;
.super Lcom/google/android/gms/internal/hb;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/hb",
        "<",
        "Lcom/google/android/gms/internal/fu;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    .locals 6

    const/4 v0, 0x0

    new-array v5, v0, [Ljava/lang/String;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hb;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected C(Landroid/os/IBinder;)Lcom/google/android/gms/internal/fu;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/fu$a;->A(Landroid/os/IBinder;)Lcom/google/android/gms/internal/fu;

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/google/android/gms/internal/hi;Lcom/google/android/gms/internal/hb$e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v0, 0x4da6e8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fx;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, p2, v0, v1}, Lcom/google/android/gms/internal/hi;->b(Lcom/google/android/gms/internal/hh;ILjava/lang/String;)V

    return-void
.end method

.method protected bu()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE"

    return-object v0
.end method

.method protected bv()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch"

    return-object v0
.end method

.method public dR()Lcom/google/android/gms/internal/fu;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fx;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/fu;

    return-object v0
.end method

.method protected synthetic x(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/fx;->C(Landroid/os/IBinder;)Lcom/google/android/gms/internal/fu;

    move-result-object v0

    return-object v0
.end method
