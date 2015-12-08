.class Lcom/google/android/gms/internal/fy$2;
.super Lcom/google/android/gms/internal/fy$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/fy;->a(Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/internal/fr;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/fy$d",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic yw:Ljava/lang/String;

.field final synthetic yx:[Lcom/google/android/gms/internal/fr;

.field final synthetic yy:Lcom/google/android/gms/internal/fy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fy;Ljava/lang/String;[Lcom/google/android/gms/internal/fr;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/fy$2;->yy:Lcom/google/android/gms/internal/fy;

    iput-object p2, p0, Lcom/google/android/gms/internal/fy$2;->yw:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/fy$2;->yx:[Lcom/google/android/gms/internal/fr;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/fy$d;-><init>(Lcom/google/android/gms/internal/fy$1;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/fu;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/fy$e;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/fy$e;-><init>(Lcom/google/android/gms/common/api/a$d;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/fy$2;->yw:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/fy$2;->yx:[Lcom/google/android/gms/internal/fr;

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/fu;->a(Lcom/google/android/gms/internal/fv;Ljava/lang/String;[Lcom/google/android/gms/internal/fr;)V

    return-void
.end method
