.class Lcom/thetransitapp/droid/RoutesScreen$3;
.super Ljava/lang/Object;
.source "RoutesScreen.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnMyLocationChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/RoutesScreen;->showDirectionPopover(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/RoutesScreen;

.field private final synthetic val$compass:Lcom/thetransitapp/droid/ui/CompassView;

.field private final synthetic val$distance:Landroid/widget/TextView;

.field private final synthetic val$route:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/RoutesScreen;Lcom/thetransitapp/droid/ui/CompassView;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/RoutesScreen$3;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    iput-object p2, p0, Lcom/thetransitapp/droid/RoutesScreen$3;->val$compass:Lcom/thetransitapp/droid/ui/CompassView;

    iput-object p3, p0, Lcom/thetransitapp/droid/RoutesScreen$3;->val$route:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    iput-object p4, p0, Lcom/thetransitapp/droid/RoutesScreen$3;->val$distance:Landroid/widget/TextView;

    .line 251
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMyLocationChange(Landroid/location/Location;)V
    .locals 4
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 254
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen$3;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    # invokes: Lcom/thetransitapp/droid/BaseMapScreen;->onMyLocationChange(Landroid/location/Location;)V
    invoke-static {v1, p1}, Lcom/thetransitapp/droid/RoutesScreen;->access$0(Lcom/thetransitapp/droid/RoutesScreen;Landroid/location/Location;)V

    .line 255
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen$3;->val$compass:Lcom/thetransitapp/droid/ui/CompassView;

    invoke-virtual {v1, p1}, Lcom/thetransitapp/droid/ui/CompassView;->setCurrent(Landroid/location/Location;)V

    .line 257
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen$3;->val$route:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v1

    .line 258
    new-instance v2, Lcom/thetransitapp/droid/model/SimplePlacemark;

    iget-object v3, p0, Lcom/thetransitapp/droid/RoutesScreen$3;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    # invokes: Lcom/thetransitapp/droid/BaseMapScreen;->getRealLocation()Landroid/location/Location;
    invoke-static {v3}, Lcom/thetransitapp/droid/RoutesScreen;->access$1(Lcom/thetransitapp/droid/RoutesScreen;)Landroid/location/Location;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(Landroid/location/Location;)V

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/Stop;->getDistance(Lcom/thetransitapp/droid/model/SimplePlacemark;)F

    move-result v1

    float-to-int v0, v1

    .line 260
    .local v0, "dist":I
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen$3;->val$distance:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, " m"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    return-void
.end method
