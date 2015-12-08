.class Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a$1;
.super Lcom/google/android/gms/maps/internal/u$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a;->getStreetViewPanoramaAsync(Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic alo:Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;

.field final synthetic alp:Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a;Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a$1;->alp:Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a;

    iput-object p2, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a$1;->alo:Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;

    invoke-direct {p0}, Lcom/google/android/gms/maps/internal/u$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a$1;->alo:Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;

    new-instance v1, Lcom/google/android/gms/maps/StreetViewPanorama;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/StreetViewPanorama;-><init>(Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;->onStreetViewPanoramaReady(Lcom/google/android/gms/maps/StreetViewPanorama;)V

    return-void
.end method
