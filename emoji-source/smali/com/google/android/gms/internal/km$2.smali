.class Lcom/google/android/gms/internal/km$2;
.super Lcom/google/android/gms/internal/km$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/km;->loadVisible(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic acf:Ljava/lang/String;

.field final synthetic acn:Lcom/google/android/gms/internal/km;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/km;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/km$2;->acn:Lcom/google/android/gms/internal/km;

    iput-object p2, p0, Lcom/google/android/gms/internal/km$2;->acf:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/km$a;-><init>(Lcom/google/android/gms/internal/km$1;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/km$2;->a(Lcom/google/android/gms/plus/internal/e;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/plus/internal/e;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/km$2;->acf:Ljava/lang/String;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/plus/internal/e;->r(Lcom/google/android/gms/common/api/a$d;Ljava/lang/String;)Lcom/google/android/gms/internal/hg;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/km$2;->a(Lcom/google/android/gms/internal/hg;)V

    return-void
.end method
