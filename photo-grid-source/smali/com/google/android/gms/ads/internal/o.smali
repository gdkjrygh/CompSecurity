.class final Lcom/google/android/gms/ads/internal/o;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/pa;

.field final synthetic c:Lcom/google/android/gms/ads/internal/zzn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/zzn;Ljava/lang/String;Lcom/google/android/gms/internal/pa;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/o;->c:Lcom/google/android/gms/ads/internal/zzn;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/o;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/o;->b:Lcom/google/android/gms/internal/pa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/o;->c:Lcom/google/android/gms/ads/internal/zzn;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->m:Lcom/google/android/gms/internal/wb;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/o;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wb;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/fb;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/o;->b:Lcom/google/android/gms/internal/pa;

    iget-object v1, v1, Lcom/google/android/gms/internal/pa;->w:Lcom/google/android/gms/ads/internal/formats/zzh$zza;

    check-cast v1, Lcom/google/android/gms/ads/internal/formats/zzf;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/fb;->a(Lcom/google/android/gms/internal/eo;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded()."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
