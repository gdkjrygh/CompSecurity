.class Lcom/thetransitapp/droid/RoutesScreen$6;
.super Ljava/lang/Object;
.source "RoutesScreen.java"

# interfaces
.implements Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/RoutesScreen;->onError(Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/RoutesScreen;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/RoutesScreen;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/RoutesScreen$6;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    .line 489
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorButtonClick()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 492
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen$6;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    # getter for: Lcom/thetransitapp/droid/RoutesScreen;->viewController:Lcom/thetransitapp/droid/controller/RouteViewController;
    invoke-static {v0}, Lcom/thetransitapp/droid/RoutesScreen;->access$3(Lcom/thetransitapp/droid/RoutesScreen;)Lcom/thetransitapp/droid/controller/RouteViewController;

    move-result-object v0

    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen$6;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/RoutesScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v2}, Lcom/thetransitapp/droid/controller/RouteViewController;->refresh(Landroid/location/Location;ZZ)V

    .line 493
    return-void
.end method
