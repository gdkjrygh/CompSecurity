.class Lcom/thetransitapp/droid/RoutesScreen$2;
.super Ljava/lang/Object;
.source "RoutesScreen.java"

# interfaces
.implements Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/RoutesScreen;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V
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
    iput-object p1, p0, Lcom/thetransitapp/droid/RoutesScreen$2;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 6
    .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 112
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 114
    .local v0, "data":Landroid/os/Bundle;
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutesScreen$2;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/RoutesScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 115
    const-string v3, "latitude"

    iget-object v4, p0, Lcom/thetransitapp/droid/RoutesScreen$2;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/RoutesScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v4

    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 116
    const-string v3, "longitude"

    iget-object v4, p0, Lcom/thetransitapp/droid/RoutesScreen$2;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/RoutesScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v4

    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 119
    :cond_0
    new-instance v1, Lcom/thetransitapp/droid/LocationScreen;

    invoke-direct {v1}, Lcom/thetransitapp/droid/LocationScreen;-><init>()V

    .line 120
    .local v1, "fragment":Landroid/support/v4/app/Fragment;
    invoke-virtual {v1, v0}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 122
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutesScreen$2;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/RoutesScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v2

    .line 123
    .local v2, "transaction":Landroid/support/v4/app/FragmentTransaction;
    const v3, 0x7f05003a

    sget-object v4, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v1, v4}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 124
    sget-object v3, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 125
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 127
    const/4 v3, 0x1

    return v3
.end method
