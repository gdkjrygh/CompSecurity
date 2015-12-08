.class Lcom/thetransitapp/droid/controller/ScheduleViewController$1;
.super Ljava/lang/Object;
.source "ScheduleViewController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/controller/ScheduleViewController;->onResult(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/controller/ScheduleViewController;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/controller/ScheduleViewController;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController$1;->this$0:Lcom/thetransitapp/droid/controller/ScheduleViewController;

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 134
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController$1;->this$0:Lcom/thetransitapp/droid/controller/ScheduleViewController;

    # getter for: Lcom/thetransitapp/droid/controller/ScheduleViewController;->view:Lcom/thetransitapp/droid/SchedulesScreen;
    invoke-static {v1}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->access$1(Lcom/thetransitapp/droid/controller/ScheduleViewController;)Lcom/thetransitapp/droid/SchedulesScreen;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController$1;->this$0:Lcom/thetransitapp/droid/controller/ScheduleViewController;

    # getter for: Lcom/thetransitapp/droid/controller/ScheduleViewController;->view:Lcom/thetransitapp/droid/SchedulesScreen;
    invoke-static {v1}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->access$1(Lcom/thetransitapp/droid/controller/ScheduleViewController;)Lcom/thetransitapp/droid/SchedulesScreen;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/SchedulesScreen;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 135
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController$1;->this$0:Lcom/thetransitapp/droid/controller/ScheduleViewController;

    # getter for: Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    invoke-static {v1}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->access$2(Lcom/thetransitapp/droid/controller/ScheduleViewController;)Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v0

    .line 136
    .local v0, "itinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController$1;->this$0:Lcom/thetransitapp/droid/controller/ScheduleViewController;

    # getter for: Lcom/thetransitapp/droid/controller/ScheduleViewController;->view:Lcom/thetransitapp/droid/SchedulesScreen;
    invoke-static {v1}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->access$1(Lcom/thetransitapp/droid/controller/ScheduleViewController;)Lcom/thetransitapp/droid/SchedulesScreen;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/SchedulesScreen;->getScheduleList()Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->updateRealTimeDataOnList(Landroid/widget/ListView;)V

    .line 138
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController$1;->this$0:Lcom/thetransitapp/droid/controller/ScheduleViewController;

    # getter for: Lcom/thetransitapp/droid/controller/ScheduleViewController;->handler:Landroid/os/Handler;
    invoke-static {v1}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->access$3(Lcom/thetransitapp/droid/controller/ScheduleViewController;)Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0x7530

    invoke-virtual {v1, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 140
    .end local v0    # "itinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    :cond_0
    return-void
.end method
