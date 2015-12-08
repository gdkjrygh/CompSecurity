.class Lcom/thetransitapp/droid/widget/RoutingDetails$1;
.super Ljava/lang/Object;
.source "RoutingDetails.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/RoutingDetails;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/RoutingDetails;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/RoutingDetails;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails$1;->this$0:Lcom/thetransitapp/droid/widget/RoutingDetails;

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 95
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingDetails$1;->this$0:Lcom/thetransitapp/droid/widget/RoutingDetails;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/RoutingDetails;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    .line 102
    :goto_0
    return-void

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingDetails$1;->this$0:Lcom/thetransitapp/droid/widget/RoutingDetails;

    # invokes: Lcom/thetransitapp/droid/widget/RoutingDetails;->updateCurrent()V
    invoke-static {v0}, Lcom/thetransitapp/droid/widget/RoutingDetails;->access$0(Lcom/thetransitapp/droid/widget/RoutingDetails;)V

    .line 101
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingDetails$1;->this$0:Lcom/thetransitapp/droid/widget/RoutingDetails;

    # getter for: Lcom/thetransitapp/droid/widget/RoutingDetails;->handler:Landroid/os/Handler;
    invoke-static {v0}, Lcom/thetransitapp/droid/widget/RoutingDetails;->access$1(Lcom/thetransitapp/droid/widget/RoutingDetails;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x4e20

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
