.class Lcom/thetransitapp/droid/controller/RouteViewController$3;
.super Ljava/lang/Object;
.source "RouteViewController.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/controller/RouteViewController;->insertRoutes()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/controller/RouteViewController;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/controller/RouteViewController;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/RouteViewController$3;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)I
    .locals 4
    .param p1, "lhs"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .param p2, "rhs"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    .line 295
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getPoint()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getPoint()D

    move-result-wide v2

    sub-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    check-cast p2, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {p0, p1, p2}, Lcom/thetransitapp/droid/controller/RouteViewController$3;->compare(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)I

    move-result v0

    return v0
.end method
