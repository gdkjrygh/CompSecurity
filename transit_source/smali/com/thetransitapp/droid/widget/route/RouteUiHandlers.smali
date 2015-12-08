.class public interface abstract Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;
.super Ljava/lang/Object;
.source "RouteUiHandlers.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;,
        Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;
    }
.end annotation


# virtual methods
.method public abstract onClick(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;)V
.end method

.method public abstract onLongClick(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;Landroid/view/View;)V
.end method

.method public abstract viewMovedSieway()V
.end method
