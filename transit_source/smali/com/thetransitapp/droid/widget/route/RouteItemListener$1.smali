.class Lcom/thetransitapp/droid/widget/route/RouteItemListener$1;
.super Ljava/lang/Object;
.source "RouteItemListener.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/route/RouteItemListener;->showMenu(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/route/RouteItemListener;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/route/RouteItemListener;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener$1;->this$0:Lcom/thetransitapp/droid/widget/route/RouteItemListener;

    .line 177
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 188
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener$1;->this$0:Lcom/thetransitapp/droid/widget/route/RouteItemListener;

    # getter for: Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;
    invoke-static {v0}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->access$1(Lcom/thetransitapp/droid/widget/route/RouteItemListener;)Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    move-result-object v0

    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MENU_OPEN:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener$1;->this$0:Lcom/thetransitapp/droid/widget/route/RouteItemListener;

    # getter for: Lcom/thetransitapp/droid/widget/route/RouteItemListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;
    invoke-static {v2}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->access$2(Lcom/thetransitapp/droid/widget/route/RouteItemListener;)Lcom/thetransitapp/droid/widget/route/RouteItem;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;->onClick(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    .line 189
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 184
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 180
    return-void
.end method
