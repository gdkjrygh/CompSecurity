.class Lcom/google/android/gms/wearable/internal/ae$1;
.super Lcom/google/android/gms/wearable/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/ae;->sendMessage(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;[B)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/d",
        "<",
        "Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic alR:Ljava/lang/String;

.field final synthetic alS:Ljava/lang/String;

.field final synthetic alT:Lcom/google/android/gms/wearable/internal/ae;

.field final synthetic yL:[B


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/ae;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/ae$1;->alT:Lcom/google/android/gms/wearable/internal/ae;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/ae$1;->alR:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/ae$1;->alS:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wearable/internal/ae$1;->yL:[B

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/d;-><init>()V

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

    check-cast p1, Lcom/google/android/gms/wearable/internal/au;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ae$1;->a(Lcom/google/android/gms/wearable/internal/au;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/au;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ae$1;->alR:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ae$1;->alS:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/ae$1;->yL:[B

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/wearable/internal/au;->a(Lcom/google/android/gms/common/api/a$d;Ljava/lang/String;Ljava/lang/String;[B)V

    return-void
.end method

.method protected au(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/ae$a;

    const/4 v1, -0x1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/ae$a;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    return-object v0
.end method

.method protected synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ae$1;->au(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;

    move-result-object v0

    return-object v0
.end method
