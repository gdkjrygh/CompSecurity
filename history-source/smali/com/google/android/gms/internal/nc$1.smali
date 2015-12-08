.class Lcom/google/android/gms/internal/nc$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/np;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/nc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/np",
        "<",
        "Lcom/google/android/gms/internal/ni;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic agE:Lcom/google/android/gms/internal/nc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/nc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/nc$1;->agE:Lcom/google/android/gms/internal/nc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dS()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/nc$1;->agE:Lcom/google/android/gms/internal/nc;

    invoke-static {v0}, Lcom/google/android/gms/internal/nc;->a(Lcom/google/android/gms/internal/nc;)V

    return-void
.end method

.method public synthetic hw()Landroid/os/IInterface;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nc$1;->nh()Lcom/google/android/gms/internal/ni;

    move-result-object v0

    return-object v0
.end method

.method public nh()Lcom/google/android/gms/internal/ni;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nc$1;->agE:Lcom/google/android/gms/internal/nc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nc;->hw()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ni;

    return-object v0
.end method
