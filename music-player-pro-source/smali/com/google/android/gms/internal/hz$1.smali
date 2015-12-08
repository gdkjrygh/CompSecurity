.class Lcom/google/android/gms/internal/hz$1;
.super Lcom/google/android/gms/internal/hz$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/hz;->a(Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/internal/hr;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/hz$c",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic DB:Ljava/lang/String;

.field final synthetic DC:[Lcom/google/android/gms/internal/hr;

.field final synthetic DD:Lcom/google/android/gms/internal/hz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hz;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[Lcom/google/android/gms/internal/hr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hz$1;->DD:Lcom/google/android/gms/internal/hz;

    iput-object p3, p0, Lcom/google/android/gms/internal/hz$1;->DB:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/hz$1;->DC:[Lcom/google/android/gms/internal/hr;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/hz$c;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/hu;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/hz$d;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/hz$d;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/hz$1;->DB:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/hz$1;->DC:[Lcom/google/android/gms/internal/hr;

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/hu;->a(Lcom/google/android/gms/internal/hv;Ljava/lang/String;[Lcom/google/android/gms/internal/hr;)V

    return-void
.end method
