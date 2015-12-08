.class public Lcom/google/android/gms/internal/kg;
.super Lcom/google/android/gms/internal/jl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/jl",
        "<",
        "Lcom/google/android/gms/internal/ki;",
        ">;"
    }
.end annotation


# direct methods
.method public varargs constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/internal/jl;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected T(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ki;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ki$a;->V(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ki;

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

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kg;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, p2, v0, v1}, Lcom/google/android/gms/internal/jt;->j(Lcom/google/android/gms/internal/js;ILjava/lang/String;)V

    return-void
.end method

.method public bK()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.common.service.START"

    return-object v0
.end method

.method protected bL()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.service.ICommonService"

    return-object v0
.end method

.method protected synthetic l(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/kg;->T(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ki;

    move-result-object v0

    return-object v0
.end method
