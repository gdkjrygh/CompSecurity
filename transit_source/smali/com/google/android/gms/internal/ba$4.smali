.class Lcom/google/android/gms/internal/ba$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ba;->onDismissScreen(Lcom/google/ads/mediation/MediationBannerAdapter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic fu:Lcom/google/android/gms/internal/ba;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ba;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ba$4;->fu:Lcom/google/android/gms/internal/ba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ba$4;->fu:Lcom/google/android/gms/internal/ba;

    invoke-static {v0}, Lcom/google/android/gms/internal/ba;->a(Lcom/google/android/gms/internal/ba;)Lcom/google/android/gms/internal/ay;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ay;->onAdClosed()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call onAdClosed."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
