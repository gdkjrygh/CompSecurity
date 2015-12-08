.class final Lcom/google/android/gms/internal/sa;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzja;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzja;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/sa;->a:Lcom/google/android/gms/internal/zzja;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/sa;->a:Lcom/google/android/gms/internal/zzja;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/sa;->a:Lcom/google/android/gms/internal/zzja;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->h()Lcom/google/android/gms/ads/internal/overlay/zzd;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzd;->zzeG()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/sa;->a:Lcom/google/android/gms/internal/zzja;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzja;->zzd(Lcom/google/android/gms/internal/zzja;)Lcom/google/android/gms/internal/sc;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/sa;->a:Lcom/google/android/gms/internal/zzja;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzja;->zzd(Lcom/google/android/gms/internal/zzja;)Lcom/google/android/gms/internal/sc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/sc;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/sa;->a:Lcom/google/android/gms/internal/zzja;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Lcom/google/android/gms/internal/zzja;Lcom/google/android/gms/internal/sc;)Lcom/google/android/gms/internal/sc;

    :cond_1
    return-void
.end method
