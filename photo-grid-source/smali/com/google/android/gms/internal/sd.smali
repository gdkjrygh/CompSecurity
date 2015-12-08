.class final Lcom/google/android/gms/internal/sd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/zzg;


# instance fields
.field private a:Lcom/google/android/gms/internal/ry;

.field private b:Lcom/google/android/gms/ads/internal/overlay/zzg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/ads/internal/overlay/zzg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/sd;->a:Lcom/google/android/gms/internal/ry;

    iput-object p2, p0, Lcom/google/android/gms/internal/sd;->b:Lcom/google/android/gms/ads/internal/overlay/zzg;

    return-void
.end method


# virtual methods
.method public final zzaV()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sd;->b:Lcom/google/android/gms/ads/internal/overlay/zzg;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/zzg;->zzaV()V

    iget-object v0, p0, Lcom/google/android/gms/internal/sd;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->c()V

    return-void
.end method

.method public final zzaW()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sd;->b:Lcom/google/android/gms/ads/internal/overlay/zzg;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/zzg;->zzaW()V

    iget-object v0, p0, Lcom/google/android/gms/internal/sd;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->d()V

    return-void
.end method
