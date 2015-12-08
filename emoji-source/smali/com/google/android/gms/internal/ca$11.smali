.class Lcom/google/android/gms/internal/ca$11;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ca;->onLeaveApplication(Lcom/google/ads/mediation/MediationInterstitialAdapter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nW:Lcom/google/android/gms/internal/ca;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ca;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ca$11;->nW:Lcom/google/android/gms/internal/ca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ca$11;->nW:Lcom/google/android/gms/internal/ca;

    invoke-static {v0}, Lcom/google/android/gms/internal/ca;->a(Lcom/google/android/gms/internal/ca;)Lcom/google/android/gms/internal/bv;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/bv;->onAdLeftApplication()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call onAdLeftApplication."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
