.class Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;
.super Ljava/lang/Object;
.source "MergedItinerary.java"

# interfaces
.implements Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->updateRealTimeDataOnList(Landroid/widget/ListView;Lcom/thetransitapp/droid/widget/route/RouteItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

.field private final synthetic val$item:Lcom/thetransitapp/droid/widget/route/RouteItem;

.field private final synthetic val$listView:Landroid/widget/ListView;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Landroid/widget/ListView;Lcom/thetransitapp/droid/widget/route/RouteItem;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;->this$0:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    iput-object p2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;->val$listView:Landroid/widget/ListView;

    iput-object p3, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;->val$item:Lcom/thetransitapp/droid/widget/route/RouteItem;

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public didAssignRealTime()V
    .locals 4

    .prologue
    .line 175
    iget-object v2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;->this$0:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->access$0(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/ScheduleItem;)V

    .line 176
    iget-object v2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;->this$0:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->loadOngoingScheduleItems()V

    .line 178
    iget-object v2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;->val$listView:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    .line 179
    .local v0, "adapter":Lcom/thetransitapp/droid/widget/route/RouteAdapter;
    iget-object v2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;->val$item:Lcom/thetransitapp/droid/widget/route/RouteItem;

    invoke-virtual {v0, v2}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->getPosition(Ljava/lang/Object;)I

    move-result v1

    .line 181
    .local v1, "position":I
    iget-object v2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;->val$listView:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v2

    if-lt v1, v2, :cond_0

    iget-object v2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;->val$listView:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v2

    if-gt v1, v2, :cond_0

    .line 182
    iget-object v2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;->val$item:Lcom/thetransitapp/droid/widget/route/RouteItem;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->refreshView()V

    .line 184
    :cond_0
    return-void
.end method
