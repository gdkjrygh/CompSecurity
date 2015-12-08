.class public Lcom/google/android/gms/drive/internal/aa;
.super Lcom/google/android/gms/drive/internal/ag$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/internal/aa$1;,
        Lcom/google/android/gms/drive/internal/aa$a;
    }
.end annotation


# instance fields
.field private final Pm:I

.field private final Qw:Lcom/google/android/gms/drive/events/c;

.field private final Qx:Lcom/google/android/gms/drive/internal/aa$a;

.field private final Qy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;Landroid/content/Context;ILcom/google/android/gms/drive/events/c;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/ag$a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/aa;->Qy:Ljava/util/List;

    iput p3, p0, Lcom/google/android/gms/drive/internal/aa;->Pm:I

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/aa;->Qw:Lcom/google/android/gms/drive/events/c;

    new-instance v0, Lcom/google/android/gms/drive/internal/aa$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/drive/internal/aa$a;-><init>(Landroid/os/Looper;Landroid/content/Context;Lcom/google/android/gms/drive/internal/aa$1;)V

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/aa;->Qx:Lcom/google/android/gms/drive/internal/aa$a;

    return-void
.end method


# virtual methods
.method public bw(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/aa;->Qy:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public bx(I)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/aa;->Qy:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public c(Lcom/google/android/gms/drive/internal/OnEventResponse;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnEventResponse;->iQ()Lcom/google/android/gms/drive/events/DriveEvent;

    move-result-object v1

    iget v0, p0, Lcom/google/android/gms/drive/internal/aa;->Pm:I

    invoke-interface {v1}, Lcom/google/android/gms/drive/events/DriveEvent;->getType()I

    move-result v2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/jx;->K(Z)V

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/aa;->Qy:Ljava/util/List;

    invoke-interface {v1}, Lcom/google/android/gms/drive/events/DriveEvent;->getType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/jx;->K(Z)V

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/aa;->Qx:Lcom/google/android/gms/drive/internal/aa$a;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/aa;->Qw:Lcom/google/android/gms/drive/events/c;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/drive/internal/aa$a;->a(Lcom/google/android/gms/drive/events/c;Lcom/google/android/gms/drive/events/DriveEvent;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
