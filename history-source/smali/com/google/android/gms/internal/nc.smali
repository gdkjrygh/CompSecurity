.class public Lcom/google/android/gms/internal/nc;
.super Lcom/google/android/gms/internal/jl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/jl",
        "<",
        "Lcom/google/android/gms/internal/ni;",
        ">;"
    }
.end annotation


# instance fields
.field protected final Ee:Lcom/google/android/gms/internal/np;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/np",
            "<",
            "Lcom/google/android/gms/internal/ni;",
            ">;"
        }
    .end annotation
.end field

.field private final agD:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;)V
    .locals 6

    const/4 v0, 0x0

    new-array v5, v0, [Ljava/lang/String;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/jl;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/nc$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/nc$1;-><init>(Lcom/google/android/gms/internal/nc;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/nc;->Ee:Lcom/google/android/gms/internal/np;

    iput-object p5, p0, Lcom/google/android/gms/internal/nc;->agD:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/nc;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nc;->dS()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/jt;Lcom/google/android/gms/internal/jl$e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "client_name"

    iget-object v2, p0, Lcom/google/android/gms/internal/nc;->agD:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const v1, 0x648278

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nc;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2, v0}, Lcom/google/android/gms/internal/jt;->e(Lcom/google/android/gms/internal/js;ILjava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method protected aM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ni;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ni$a;->aO(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ni;

    move-result-object v0

    return-object v0
.end method

.method protected bK()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"

    return-object v0
.end method

.method protected bL()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    return-object v0
.end method

.method protected synthetic l(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/nc;->aM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ni;

    move-result-object v0

    return-object v0
.end method
