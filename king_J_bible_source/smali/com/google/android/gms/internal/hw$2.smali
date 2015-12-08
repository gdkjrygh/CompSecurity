.class Lcom/google/android/gms/internal/hw$2;
.super Lcom/google/android/gms/internal/hw$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/hw;->loadPanoramaInfoAndGrantAccess(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic TA:Lcom/google/android/gms/internal/hw;

.field final synthetic Tz:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hw;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hw$2;->TA:Lcom/google/android/gms/internal/hw;

    iput-object p2, p0, Lcom/google/android/gms/internal/hw$2;->Tz:Landroid/net/Uri;

    invoke-direct {p0}, Lcom/google/android/gms/internal/hw$a;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/hx;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/hw$2;->a(Lcom/google/android/gms/internal/hx;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/hx;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/hw$2;->Tz:Landroid/net/Uri;

    const/4 v1, 0x1

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/android/gms/internal/hx;->a(Lcom/google/android/gms/common/api/a$d;Landroid/net/Uri;Z)V

    return-void
.end method
