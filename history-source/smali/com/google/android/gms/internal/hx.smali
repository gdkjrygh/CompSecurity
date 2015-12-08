.class public Lcom/google/android/gms/internal/hx;
.super Lcom/google/android/gms/internal/jl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/jl",
        "<",
        "Lcom/google/android/gms/internal/hu;",
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

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/jl;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected G(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hu;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/hu$a;->E(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hu;

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/google/android/gms/internal/jt;Lcom/google/android/gms/internal/jl$e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v0, 0x648278

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hx;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, p2, v0, v1}, Lcom/google/android/gms/internal/jt;->b(Lcom/google/android/gms/internal/js;ILjava/lang/String;)V

    return-void
.end method

.method protected bK()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE"

    return-object v0
.end method

.method protected bL()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch"

    return-object v0
.end method

.method public fH()Lcom/google/android/gms/internal/hu;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hx;->hw()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hu;

    return-object v0
.end method

.method protected synthetic l(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/hx;->G(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hu;

    move-result-object v0

    return-object v0
.end method
