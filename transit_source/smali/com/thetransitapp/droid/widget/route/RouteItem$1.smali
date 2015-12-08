.class Lcom/thetransitapp/droid/widget/route/RouteItem$1;
.super Ljava/lang/Object;
.source "RouteItem.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/route/RouteItem;->animateMenu()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/route/RouteItem;

.field private final synthetic val$backgroundView:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/route/RouteItem;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$1;->this$0:Lcom/thetransitapp/droid/widget/route/RouteItem;

    iput-object p2, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$1;->val$backgroundView:Landroid/view/View;

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 108
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$1;->this$0:Lcom/thetransitapp/droid/widget/route/RouteItem;

    # getter for: Lcom/thetransitapp/droid/widget/route/RouteItem;->routeItemListener:Lcom/thetransitapp/droid/widget/route/RouteItemListener;
    invoke-static {v0}, Lcom/thetransitapp/droid/widget/route/RouteItem;->access$0(Lcom/thetransitapp/droid/widget/route/RouteItem;)Lcom/thetransitapp/droid/widget/route/RouteItemListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$1;->this$0:Lcom/thetransitapp/droid/widget/route/RouteItem;

    # getter for: Lcom/thetransitapp/droid/widget/route/RouteItem;->routeItemListener:Lcom/thetransitapp/droid/widget/route/RouteItemListener;
    invoke-static {v0}, Lcom/thetransitapp/droid/widget/route/RouteItem;->access$0(Lcom/thetransitapp/droid/widget/route/RouteItem;)Lcom/thetransitapp/droid/widget/route/RouteItemListener;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->showMenu(Z)V

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$1;->val$backgroundView:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setPressed(Z)V

    .line 113
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem$1;->val$backgroundView:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 114
    return-void
.end method
