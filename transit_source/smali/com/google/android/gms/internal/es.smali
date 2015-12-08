.class public Lcom/google/android/gms/internal/es;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/es$1;,
        Lcom/google/android/gms/internal/es$a;,
        Lcom/google/android/gms/internal/es$b;
    }
.end annotation


# instance fields
.field protected mz:Lcom/google/android/gms/internal/em;

.field protected np:Lcom/google/android/gms/internal/es$a;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/em;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/es;->mz:Lcom/google/android/gms/internal/em;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/es;->Q(I)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/em;ILcom/google/android/gms/internal/es$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/es;-><init>(Lcom/google/android/gms/internal/em;I)V

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/em;I)Lcom/google/android/gms/internal/es;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ek;->bK()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/es$b;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/es$b;-><init>(Lcom/google/android/gms/internal/em;I)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/es;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/es;-><init>(Lcom/google/android/gms/internal/em;I)V

    goto :goto_0
.end method


# virtual methods
.method protected Q(I)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/es$a;

    new-instance v1, Landroid/os/Binder;

    invoke-direct {v1}, Landroid/os/Binder;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/es$a;-><init>(ILandroid/os/IBinder;Lcom/google/android/gms/internal/es$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/es;->np:Lcom/google/android/gms/internal/es$a;

    return-void
.end method

.method public bX()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->mz:Lcom/google/android/gms/internal/em;

    iget-object v1, p0, Lcom/google/android/gms/internal/es;->np:Lcom/google/android/gms/internal/es$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/es$a;->nq:Landroid/os/IBinder;

    iget-object v2, p0, Lcom/google/android/gms/internal/es;->np:Lcom/google/android/gms/internal/es$a;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/es$a;->ca()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/em;->a(Landroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method

.method public bY()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->np:Lcom/google/android/gms/internal/es$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/es$a;->ca()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public bZ()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->np:Lcom/google/android/gms/internal/es$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/es$a;->nq:Landroid/os/IBinder;

    return-object v0
.end method

.method public e(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public setGravity(I)V
    .locals 1
    .param p1, "gravity"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/es;->np:Lcom/google/android/gms/internal/es$a;

    iput p1, v0, Lcom/google/android/gms/internal/es$a;->gravity:I

    return-void
.end method
