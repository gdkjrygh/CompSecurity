.class Lcom/thetransitapp/droid/util/ShieldUtility$1;
.super Ljava/lang/Object;
.source "ShieldUtility.java"

# interfaces
.implements Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/util/ShieldUtility;->draw(Lcom/thetransitapp/droid/model/RoutingLeg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/util/ShieldUtility;

.field private final synthetic val$leg:Lcom/thetransitapp/droid/model/RoutingLeg;

.field private final synthetic val$positions:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/util/ShieldUtility;Lcom/thetransitapp/droid/model/RoutingLeg;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/util/ShieldUtility$1;->this$0:Lcom/thetransitapp/droid/util/ShieldUtility;

    iput-object p2, p0, Lcom/thetransitapp/droid/util/ShieldUtility$1;->val$leg:Lcom/thetransitapp/droid/model/RoutingLeg;

    iput-object p3, p0, Lcom/thetransitapp/droid/util/ShieldUtility$1;->val$positions:Ljava/util/List;

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoaded(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/String;Z)V
    .locals 5
    .param p1, "imageView"    # Landroid/widget/ImageView;
    .param p2, "loadedBitmap"    # Landroid/graphics/Bitmap;
    .param p3, "url"    # Ljava/lang/String;
    .param p4, "loadedFromCache"    # Z

    .prologue
    .line 65
    if-eqz p2, :cond_0

    .line 66
    iget-object v2, p0, Lcom/thetransitapp/droid/util/ShieldUtility$1;->val$leg:Lcom/thetransitapp/droid/model/RoutingLeg;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v2

    iget-object v3, p0, Lcom/thetransitapp/droid/util/ShieldUtility$1;->this$0:Lcom/thetransitapp/droid/util/ShieldUtility;

    # getter for: Lcom/thetransitapp/droid/util/ShieldUtility;->context:Landroid/content/Context;
    invoke-static {v3}, Lcom/thetransitapp/droid/util/ShieldUtility;->access$0(Lcom/thetransitapp/droid/util/ShieldUtility;)Landroid/content/Context;

    move-result-object v3

    .line 67
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f08001e

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iget-object v4, p0, Lcom/thetransitapp/droid/util/ShieldUtility$1;->this$0:Lcom/thetransitapp/droid/util/ShieldUtility;

    # getter for: Lcom/thetransitapp/droid/util/ShieldUtility;->context:Landroid/content/Context;
    invoke-static {v4}, Lcom/thetransitapp/droid/util/ShieldUtility;->access$0(Lcom/thetransitapp/droid/util/ShieldUtility;)Landroid/content/Context;

    move-result-object v4

    .line 66
    invoke-static {p2, v2, v3, v4}, Lcom/thetransitapp/droid/util/BitmapUtility;->getShield(Landroid/graphics/Bitmap;Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;ILandroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 68
    .local v1, "shield":Landroid/graphics/Bitmap;
    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    .line 69
    .local v0, "pin":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    iget-object v2, p0, Lcom/thetransitapp/droid/util/ShieldUtility$1;->this$0:Lcom/thetransitapp/droid/util/ShieldUtility;

    iget-object v3, p0, Lcom/thetransitapp/droid/util/ShieldUtility$1;->val$positions:Ljava/util/List;

    # invokes: Lcom/thetransitapp/droid/util/ShieldUtility;->showShields(Ljava/util/List;Lcom/google/android/gms/maps/model/BitmapDescriptor;)V
    invoke-static {v2, v3, v0}, Lcom/thetransitapp/droid/util/ShieldUtility;->access$1(Lcom/thetransitapp/droid/util/ShieldUtility;Ljava/util/List;Lcom/google/android/gms/maps/model/BitmapDescriptor;)V

    .line 71
    .end local v0    # "pin":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .end local v1    # "shield":Landroid/graphics/Bitmap;
    :cond_0
    return-void
.end method
