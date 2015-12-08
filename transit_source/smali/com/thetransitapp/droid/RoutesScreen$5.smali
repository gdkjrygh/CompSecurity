.class Lcom/thetransitapp/droid/RoutesScreen$5;
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
    iput-object p1, p0, Lcom/thetransitapp/droid/RoutesScreen$5;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    .line 478
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorButtonClick()V
    .locals 3

    .prologue
    .line 481
    new-instance v0, Lcom/thetransitapp/droid/service/NotificationTask;

    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen$5;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/RoutesScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/thetransitapp/droid/RoutesScreen$5;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/RoutesScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/service/NotificationTask;-><init>(Landroid/content/Context;Landroid/location/Location;)V

    .line 482
    return-void
.end method
