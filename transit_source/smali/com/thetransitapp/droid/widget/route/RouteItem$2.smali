.class Lcom/thetransitapp/droid/widget/route/RouteItem$2;
.super Ljava/lang/Object;
.source "RouteItem.java"

# interfaces
.implements Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/route/RouteItem;->setupRouteImage(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/route/RouteItem;

.field private final synthetic val$routeImage:Lcom/thetransitapp/droid/model/RouteImage;

.field private final synthetic val$routeNumber:Landroid/view/View;

.field private final synthetic val$spacer:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/route/RouteItem;Lcom/thetransitapp/droid/model/RouteImage;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$2;->this$0:Lcom/thetransitapp/droid/widget/route/RouteItem;

    iput-object p2, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$2;->val$routeImage:Lcom/thetransitapp/droid/model/RouteImage;

    iput-object p3, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$2;->val$routeNumber:Landroid/view/View;

    iput-object p4, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$2;->val$spacer:Landroid/view/View;

    .line 257
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoaded(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/String;Z)V
    .locals 2
    .param p1, "arg0"    # Landroid/widget/ImageView;
    .param p2, "arg1"    # Landroid/graphics/Bitmap;
    .param p3, "arg2"    # Ljava/lang/String;
    .param p4, "arg3"    # Z

    .prologue
    .line 260
    invoke-virtual {p1}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 261
    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$2;->val$routeImage:Lcom/thetransitapp/droid/model/RouteImage;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteImage;->isReplaceName()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 262
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$2;->val$routeNumber:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$2;->val$spacer:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 268
    :cond_0
    :goto_0
    return-void

    .line 265
    :cond_1
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$2;->val$spacer:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method
