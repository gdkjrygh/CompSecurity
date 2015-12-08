.class Lcom/thetransitapp/droid/widget/route/RouteAdapter$1;
.super Ljava/lang/Object;
.source "RouteAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/route/RouteAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/route/RouteAdapter;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/route/RouteAdapter;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 95
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/route/RouteAdapter;->callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;
    invoke-static {v0}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->access$0(Lcom/thetransitapp/droid/widget/route/RouteAdapter;)Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/route/RouteAdapter;->callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;
    invoke-static {v0}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->access$0(Lcom/thetransitapp/droid/widget/route/RouteAdapter;)Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    move-result-object v0

    invoke-interface {v0}, Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;->toggleInactiveRoute()V

    .line 98
    :cond_0
    return-void
.end method
