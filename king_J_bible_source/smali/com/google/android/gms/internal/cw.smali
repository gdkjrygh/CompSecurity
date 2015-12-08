.class public Lcom/google/android/gms/internal/cw;
.super Lcom/google/android/gms/internal/ff;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ff",
        "<",
        "Lcom/google/android/gms/internal/db;",
        ">;"
    }
.end annotation


# instance fields
.field final pe:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;I)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/ff;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    iput p4, p0, Lcom/google/android/gms/internal/cw;->pe:I

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/fm;Lcom/google/android/gms/internal/ff$e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget v1, p0, Lcom/google/android/gms/internal/cw;->pe:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cw;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2, v0}, Lcom/google/android/gms/internal/fm;->g(Lcom/google/android/gms/internal/fl;ILjava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method protected bg()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.ads.service.START"

    return-object v0
.end method

.method protected bh()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.request.IAdRequestService"

    return-object v0
.end method

.method public bi()Lcom/google/android/gms/internal/db;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/ff;->eM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/db;

    return-object v0
.end method

.method protected q(Landroid/os/IBinder;)Lcom/google/android/gms/internal/db;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/db$a;->s(Landroid/os/IBinder;)Lcom/google/android/gms/internal/db;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic r(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/cw;->q(Landroid/os/IBinder;)Lcom/google/android/gms/internal/db;

    move-result-object v0

    return-object v0
.end method
