.class final Lcom/google/android/gms/internal/oo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/is;

.field final synthetic b:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

.field final synthetic c:Lcom/google/android/gms/internal/or;

.field final synthetic d:Lcom/google/android/gms/internal/om;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/om;Lcom/google/android/gms/internal/is;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/or;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/oo;->d:Lcom/google/android/gms/internal/om;

    iput-object p2, p0, Lcom/google/android/gms/internal/oo;->a:Lcom/google/android/gms/internal/is;

    iput-object p3, p0, Lcom/google/android/gms/internal/oo;->b:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iput-object p4, p0, Lcom/google/android/gms/internal/oo;->c:Lcom/google/android/gms/internal/or;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/oo;->a:Lcom/google/android/gms/internal/is;

    iget-object v1, p0, Lcom/google/android/gms/internal/oo;->d:Lcom/google/android/gms/internal/om;

    invoke-static {v1}, Lcom/google/android/gms/internal/om;->c(Lcom/google/android/gms/internal/om;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/b/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/oo;->b:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v3, p0, Lcom/google/android/gms/internal/oo;->d:Lcom/google/android/gms/internal/om;

    invoke-static {v3}, Lcom/google/android/gms/internal/om;->d(Lcom/google/android/gms/internal/om;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/oo;->c:Lcom/google/android/gms/internal/or;

    iget-object v5, p0, Lcom/google/android/gms/internal/oo;->d:Lcom/google/android/gms/internal/om;

    invoke-static {v5}, Lcom/google/android/gms/internal/om;->a(Lcom/google/android/gms/internal/om;)Ljava/lang/String;

    move-result-object v5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/b/a;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/reward/mediation/client/zza;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fail to initialize adapter "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/oo;->d:Lcom/google/android/gms/internal/om;

    invoke-static {v2}, Lcom/google/android/gms/internal/om;->b(Lcom/google/android/gms/internal/om;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/oo;->d:Lcom/google/android/gms/internal/om;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/om;->a(I)V

    goto :goto_0
.end method
