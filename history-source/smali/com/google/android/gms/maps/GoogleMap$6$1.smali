.class Lcom/google/android/gms/maps/GoogleMap$6$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/GoogleMap$6;->activate(Lcom/google/android/gms/maps/internal/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic akv:Lcom/google/android/gms/maps/internal/i;

.field final synthetic akw:Lcom/google/android/gms/maps/GoogleMap$6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/GoogleMap$6;Lcom/google/android/gms/maps/internal/i;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/GoogleMap$6$1;->akw:Lcom/google/android/gms/maps/GoogleMap$6;

    iput-object p2, p0, Lcom/google/android/gms/maps/GoogleMap$6$1;->akv:Lcom/google/android/gms/maps/internal/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 2
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$6$1;->akv:Lcom/google/android/gms/maps/internal/i;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/i;->d(Landroid/location/Location;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
