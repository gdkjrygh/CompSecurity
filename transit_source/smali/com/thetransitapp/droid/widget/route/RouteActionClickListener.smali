.class public Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;
.super Ljava/lang/Object;
.source "RouteActionClickListener.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

.field private final routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

.field private final uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;


# direct methods
.method public constructor <init>(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;)V
    .locals 0
    .param p1, "uiHandlers"    # Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;
    .param p2, "clickType"    # Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;
    .param p3, "routeItem"    # Lcom/thetransitapp/droid/widget/route/RouteItem;

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    .line 15
    iput-object p2, p0, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    .line 16
    iput-object p3, p0, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

    .line 17
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 21
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

    invoke-interface {v0, v1, v2}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;->onClick(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    .line 22
    return-void
.end method
