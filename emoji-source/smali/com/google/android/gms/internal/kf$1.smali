.class Lcom/google/android/gms/internal/kf$1;
.super Lcom/google/android/gms/internal/kf$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/kf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/kf$d",
        "<",
        "Lcom/google/android/gms/panorama/PanoramaApi$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic abk:Landroid/net/Uri;

.field final synthetic abl:Landroid/os/Bundle;


# virtual methods
.method protected a(Landroid/content/Context;Lcom/google/android/gms/internal/ke;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/kf$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/kf$a;-><init>(Lcom/google/android/gms/common/api/a$d;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kf$1;->abk:Landroid/net/Uri;

    iget-object v2, p0, Lcom/google/android/gms/internal/kf$1;->abl:Landroid/os/Bundle;

    invoke-static {p1, p2, v0, v1, v2}, Lcom/google/android/gms/internal/kf;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ke;Lcom/google/android/gms/internal/kd;Landroid/net/Uri;Landroid/os/Bundle;)V

    return-void
.end method

.method protected aj(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/panorama/PanoramaApi$a;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/kc;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/kc;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/content/Intent;I)V

    return-object v0
.end method

.method protected synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/kf$1;->aj(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/panorama/PanoramaApi$a;

    move-result-object v0

    return-object v0
.end method
