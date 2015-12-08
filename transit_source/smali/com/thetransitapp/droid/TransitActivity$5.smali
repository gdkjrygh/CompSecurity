.class Lcom/thetransitapp/droid/TransitActivity$5;
.super Ljava/lang/Object;
.source "TransitActivity.java"

# interfaces
.implements Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/TransitActivity;->showLocationServiceError()V
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
    iput-object p1, p0, Lcom/thetransitapp/droid/TransitActivity$5;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    .line 499
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorButtonClick()V
    .locals 1

    .prologue
    .line 502
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity$5;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->hideError()V

    .line 504
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity$5;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    # getter for: Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;
    invoke-static {v0}, Lcom/thetransitapp/droid/TransitActivity;->access$0(Lcom/thetransitapp/droid/TransitActivity;)Lcom/google/android/gms/location/LocationClient;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 505
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity$5;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    # getter for: Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;
    invoke-static {v0}, Lcom/thetransitapp/droid/TransitActivity;->access$0(Lcom/thetransitapp/droid/TransitActivity;)Lcom/google/android/gms/location/LocationClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity$5;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    # getter for: Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;
    invoke-static {v0}, Lcom/thetransitapp/droid/TransitActivity;->access$0(Lcom/thetransitapp/droid/TransitActivity;)Lcom/google/android/gms/location/LocationClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_1

    .line 506
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity$5;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    # getter for: Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;
    invoke-static {v0}, Lcom/thetransitapp/droid/TransitActivity;->access$0(Lcom/thetransitapp/droid/TransitActivity;)Lcom/google/android/gms/location/LocationClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationClient;->connect()V

    .line 511
    :cond_0
    :goto_0
    return-void

    .line 507
    :cond_1
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity$5;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_0

    .line 508
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity$5;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->showLocationServiceError()V

    goto :goto_0
.end method
