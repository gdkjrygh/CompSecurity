.class Lcom/thetransitapp/droid/BaseMapScreen$1;
.super Ljava/lang/Object;
.source "BaseMapScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/BaseMapScreen;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/BaseMapScreen;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/BaseMapScreen;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/BaseMapScreen$1;->this$0:Lcom/thetransitapp/droid/BaseMapScreen;

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 55
    iget-object v1, p0, Lcom/thetransitapp/droid/BaseMapScreen$1;->this$0:Lcom/thetransitapp/droid/BaseMapScreen;

    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen$1;->this$0:Lcom/thetransitapp/droid/BaseMapScreen;

    # getter for: Lcom/thetransitapp/droid/BaseMapScreen;->tracking:Z
    invoke-static {v0}, Lcom/thetransitapp/droid/BaseMapScreen;->access$0(Lcom/thetransitapp/droid/BaseMapScreen;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-static {v1, v0}, Lcom/thetransitapp/droid/BaseMapScreen;->access$1(Lcom/thetransitapp/droid/BaseMapScreen;Z)V

    .line 56
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen$1;->this$0:Lcom/thetransitapp/droid/BaseMapScreen;

    # getter for: Lcom/thetransitapp/droid/BaseMapScreen;->currentLocationButton:Landroid/widget/ImageButton;
    invoke-static {v0}, Lcom/thetransitapp/droid/BaseMapScreen;->access$2(Lcom/thetransitapp/droid/BaseMapScreen;)Landroid/widget/ImageButton;

    move-result-object v1

    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen$1;->this$0:Lcom/thetransitapp/droid/BaseMapScreen;

    # getter for: Lcom/thetransitapp/droid/BaseMapScreen;->tracking:Z
    invoke-static {v0}, Lcom/thetransitapp/droid/BaseMapScreen;->access$0(Lcom/thetransitapp/droid/BaseMapScreen;)Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f0200a0

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 59
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen$1;->this$0:Lcom/thetransitapp/droid/BaseMapScreen;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getMyLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen$1;->this$0:Lcom/thetransitapp/droid/BaseMapScreen;

    iget-object v1, p0, Lcom/thetransitapp/droid/BaseMapScreen$1;->this$0:Lcom/thetransitapp/droid/BaseMapScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getMyLocation()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/BaseMapScreen;->onMyLocationChange(Landroid/location/Location;)V

    .line 62
    :cond_0
    return-void

    .line 55
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 57
    :cond_2
    const v0, 0x7f02009f

    goto :goto_1
.end method
