.class Lcom/thetransitapp/droid/controller/RouteViewController$2;
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
        "Lcom/thetransitapp/droid/widget/route/RouteItem;",
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
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/RouteViewController$2;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    .line 258
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/thetransitapp/droid/widget/route/RouteItem;Lcom/thetransitapp/droid/widget/route/RouteItem;)I
    .locals 5
    .param p1, "lhs"    # Lcom/thetransitapp/droid/widget/route/RouteItem;
    .param p2, "rhs"    # Lcom/thetransitapp/droid/widget/route/RouteItem;

    .prologue
    .line 261
    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getPoint()D

    move-result-wide v1

    invoke-virtual {p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getPoint()D

    move-result-wide v3

    sub-double/2addr v1, v3

    double-to-int v0, v1

    .line 263
    .local v0, "result":I
    if-nez v0, :cond_0

    .line 264
    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v1

    .line 265
    invoke-virtual {p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v2

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->compareTo(Lcom/thetransitapp/droid/model/ScheduleItem;)I

    move-result v0

    .line 268
    .end local v0    # "result":I
    :cond_0
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/thetransitapp/droid/widget/route/RouteItem;

    check-cast p2, Lcom/thetransitapp/droid/widget/route/RouteItem;

    invoke-virtual {p0, p1, p2}, Lcom/thetransitapp/droid/controller/RouteViewController$2;->compare(Lcom/thetransitapp/droid/widget/route/RouteItem;Lcom/thetransitapp/droid/widget/route/RouteItem;)I

    move-result v0

    return v0
.end method
