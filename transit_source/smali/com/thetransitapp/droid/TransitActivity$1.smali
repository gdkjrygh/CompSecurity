.class Lcom/thetransitapp/droid/TransitActivity$1;
.super Ljava/lang/Object;
.source "TransitActivity.java"

# interfaces
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/TransitActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/TransitActivity;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/TransitActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/TransitActivity$1;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 107
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity$1;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    # getter for: Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;
    invoke-static {v0}, Lcom/thetransitapp/droid/TransitActivity;->access$0(Lcom/thetransitapp/droid/TransitActivity;)Lcom/google/android/gms/location/LocationClient;

    move-result-object v0

    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity$1;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    # invokes: Lcom/thetransitapp/droid/TransitActivity;->getLocationRequest()Lcom/google/android/gms/location/LocationRequest;
    invoke-static {v1}, Lcom/thetransitapp/droid/TransitActivity;->access$1(Lcom/thetransitapp/droid/TransitActivity;)Lcom/google/android/gms/location/LocationRequest;

    move-result-object v1

    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity$1;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)V

    .line 109
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity$1;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity$1;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    # getter for: Lcom/thetransitapp/droid/TransitActivity;->routeScreen:Lcom/thetransitapp/droid/RoutesScreen;
    invoke-static {v0}, Lcom/thetransitapp/droid/TransitActivity;->access$2(Lcom/thetransitapp/droid/TransitActivity;)Lcom/thetransitapp/droid/RoutesScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/RoutesScreen;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity$1;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->showLocationServiceError()V

    .line 112
    :cond_0
    return-void
.end method

.method public onDisconnected()V
    .locals 0

    .prologue
    .line 103
    return-void
.end method
