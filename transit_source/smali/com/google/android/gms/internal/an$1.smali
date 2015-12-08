.class Lcom/google/android/gms/internal/an$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/an;->a(JJ)Lcom/google/android/gms/internal/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic eN:Lcom/google/android/gms/internal/at;

.field final synthetic eO:Lcom/google/android/gms/internal/an;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/an;Lcom/google/android/gms/internal/at;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/an$1;->eO:Lcom/google/android/gms/internal/an;

    iput-object p2, p0, Lcom/google/android/gms/internal/an$1;->eN:Lcom/google/android/gms/internal/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/an$1;->eN:Lcom/google/android/gms/internal/at;

    iget-object v0, v0, Lcom/google/android/gms/internal/at;->fn:Lcom/google/android/gms/internal/ax;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ax;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not destroy mediation adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
