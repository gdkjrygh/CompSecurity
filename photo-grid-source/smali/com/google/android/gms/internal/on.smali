.class final Lcom/google/android/gms/internal/on;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/is;

.field final synthetic b:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

.field final synthetic c:Lcom/google/android/gms/internal/om;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/om;Lcom/google/android/gms/internal/is;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/on;->c:Lcom/google/android/gms/internal/om;

    iput-object p2, p0, Lcom/google/android/gms/internal/on;->a:Lcom/google/android/gms/internal/is;

    iput-object p3, p0, Lcom/google/android/gms/internal/on;->b:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/on;->a:Lcom/google/android/gms/internal/is;

    iget-object v1, p0, Lcom/google/android/gms/internal/on;->b:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v2, p0, Lcom/google/android/gms/internal/on;->c:Lcom/google/android/gms/internal/om;

    invoke-static {v2}, Lcom/google/android/gms/internal/om;->a(Lcom/google/android/gms/internal/om;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Fail to load ad from adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/on;->c:Lcom/google/android/gms/internal/om;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/om;->a(I)V

    goto :goto_0
.end method
