.class Lcom/google/android/gms/maps/MapFragment$a$1;
.super Lcom/google/android/gms/maps/internal/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/MapFragment$a;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic akU:Lcom/google/android/gms/maps/OnMapReadyCallback;

.field final synthetic akV:Lcom/google/android/gms/maps/MapFragment$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/MapFragment$a;Lcom/google/android/gms/maps/OnMapReadyCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/MapFragment$a$1;->akV:Lcom/google/android/gms/maps/MapFragment$a;

    iput-object p2, p0, Lcom/google/android/gms/maps/MapFragment$a$1;->akU:Lcom/google/android/gms/maps/OnMapReadyCallback;

    invoke-direct {p0}, Lcom/google/android/gms/maps/internal/m$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment$a$1;->akU:Lcom/google/android/gms/maps/OnMapReadyCallback;

    new-instance v1, Lcom/google/android/gms/maps/GoogleMap;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/GoogleMap;-><init>(Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/OnMapReadyCallback;->onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V

    return-void
.end method
