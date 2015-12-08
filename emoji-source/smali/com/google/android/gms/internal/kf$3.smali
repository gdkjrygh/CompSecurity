.class Lcom/google/android/gms/internal/kf$3;
.super Lcom/google/android/gms/internal/kf$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/kf;->loadPanoramaInfoAndGrantAccess(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic abk:Landroid/net/Uri;

.field final synthetic abm:Lcom/google/android/gms/internal/kf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/kf;Landroid/net/Uri;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/kf$3;->abm:Lcom/google/android/gms/internal/kf;

    iput-object p2, p0, Lcom/google/android/gms/internal/kf$3;->abk:Landroid/net/Uri;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/kf$b;-><init>(Lcom/google/android/gms/internal/kf$1;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;Lcom/google/android/gms/internal/ke;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/kf$c;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/kf$c;-><init>(Lcom/google/android/gms/common/api/a$d;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kf$3;->abk:Landroid/net/Uri;

    const/4 v2, 0x0

    invoke-static {p1, p2, v0, v1, v2}, Lcom/google/android/gms/internal/kf;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ke;Lcom/google/android/gms/internal/kd;Landroid/net/Uri;Landroid/os/Bundle;)V

    return-void
.end method
