.class final Lcom/google/android/gms/ads/internal/formats/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/internal/formats/zzh;

.field final synthetic b:Lcom/google/android/gms/ads/internal/formats/zzj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/formats/zzj;Lcom/google/android/gms/ads/internal/formats/zzh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/formats/h;->b:Lcom/google/android/gms/ads/internal/formats/zzj;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/formats/h;->a:Lcom/google/android/gms/ads/internal/formats/zzh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/h;->a:Lcom/google/android/gms/ads/internal/formats/zzh;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/formats/zzh;->zzdC()Lcom/google/android/gms/internal/ry;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/h;->b:Lcom/google/android/gms/ads/internal/formats/zzj;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/formats/zzj;->a(Lcom/google/android/gms/ads/internal/formats/zzj;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :cond_0
    return-void
.end method
