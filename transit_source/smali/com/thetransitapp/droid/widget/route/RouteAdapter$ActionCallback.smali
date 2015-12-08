.class public interface abstract Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;
.super Ljava/lang/Object;
.source "RouteAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/widget/route/RouteAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ActionCallback"
.end annotation


# virtual methods
.method public abstract menuExpanded(Lcom/thetransitapp/droid/widget/route/RouteItem;)V
.end method

.method public abstract showDirectionPopover(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Landroid/view/View;)V
.end method

.method public abstract showItinerary(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
.end method

.method public abstract showSchedules(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
.end method

.method public abstract showTimePopover(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Landroid/view/View;)V
.end method

.method public abstract toggleFavorite(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
.end method

.method public abstract toggleInactiveRoute()V
.end method

.method public abstract viewMovedSideway()V
.end method
