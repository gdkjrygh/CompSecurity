.class Lcom/google/android/gms/internal/kl$3;
.super Lcom/google/android/gms/internal/kl$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/kl;->write(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/plus/model/moments/Moment;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ace:Lcom/google/android/gms/internal/kl;

.field final synthetic acj:Lcom/google/android/gms/plus/model/moments/Moment;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/kl;Lcom/google/android/gms/plus/model/moments/Moment;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/kl$3;->ace:Lcom/google/android/gms/internal/kl;

    iput-object p2, p0, Lcom/google/android/gms/internal/kl$3;->acj:Lcom/google/android/gms/plus/model/moments/Moment;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/kl$c;-><init>(Lcom/google/android/gms/internal/kl$1;)V

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

    check-cast p1, Lcom/google/android/gms/plus/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/kl$3;->a(Lcom/google/android/gms/plus/internal/e;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/plus/internal/e;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kl$3;->acj:Lcom/google/android/gms/plus/model/moments/Moment;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/plus/model/moments/Moment;)V

    return-void
.end method
