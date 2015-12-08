.class Lcom/google/android/gms/drive/internal/n$2;
.super Lcom/google/android/gms/drive/internal/l$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/n;->b(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/DriveEvent$Listener;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Fl:Lcom/google/android/gms/drive/DriveId;

.field final synthetic Fm:I

.field final synthetic Fn:Lcom/google/android/gms/drive/internal/s;

.field final synthetic Fo:Lcom/google/android/gms/drive/internal/n;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/n;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/internal/s;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/n$2;->Fo:Lcom/google/android/gms/drive/internal/n;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/n$2;->Fl:Lcom/google/android/gms/drive/DriveId;

    iput p3, p0, Lcom/google/android/gms/drive/internal/n$2;->Fm:I

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/n$2;->Fn:Lcom/google/android/gms/drive/internal/s;

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/l$j;-><init>()V

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

    check-cast p1, Lcom/google/android/gms/drive/internal/n;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/n$2;->a(Lcom/google/android/gms/drive/internal/n;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/n;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/n;->fE()Lcom/google/android/gms/drive/internal/u;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/RemoveEventListenerRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/n$2;->Fl:Lcom/google/android/gms/drive/DriveId;

    iget v3, p0, Lcom/google/android/gms/drive/internal/n$2;->Fm:I

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/RemoveEventListenerRequest;-><init>(Lcom/google/android/gms/drive/DriveId;I)V

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/n$2;->Fn:Lcom/google/android/gms/drive/internal/s;

    const/4 v3, 0x0

    new-instance v4, Lcom/google/android/gms/drive/internal/al;

    invoke-direct {v4, p0}, Lcom/google/android/gms/drive/internal/al;-><init>(Lcom/google/android/gms/common/api/a$d;)V

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/google/android/gms/drive/internal/u;->a(Lcom/google/android/gms/drive/internal/RemoveEventListenerRequest;Lcom/google/android/gms/drive/internal/w;Ljava/lang/String;Lcom/google/android/gms/drive/internal/v;)V

    return-void
.end method
