.class Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$1;
.super Ljava/lang/Object;
.source "MergedItinerary.java"

# interfaces
.implements Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->updateRealTimeDataOnList(Landroid/widget/ListView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

.field private final synthetic val$listView:Landroid/widget/ListView;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Landroid/widget/ListView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$1;->this$0:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    iput-object p2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$1;->val$listView:Landroid/widget/ListView;

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public didAssignRealTime()V
    .locals 7

    .prologue
    .line 136
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$1;->this$0:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->access$0(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/ScheduleItem;)V

    .line 137
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$1;->this$0:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->loadOngoingScheduleItems()V

    .line 139
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$1;->val$listView:Landroid/widget/ListView;

    invoke-virtual {v5}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;

    .line 140
    .local v0, "adapter":Lcom/thetransitapp/droid/widget/ScheduleAdapter;
    const/4 v3, 0x0

    .line 141
    .local v3, "realtimeFound":Z
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .local v4, "toCancel":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/widget/ListViewItem<Lcom/thetransitapp/droid/model/ScheduleItem;>;>;"
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->getCount()I

    move-result v5

    if-lt v1, v5, :cond_1

    .line 157
    if-eqz v3, :cond_0

    .line 158
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_4

    .line 163
    :cond_0
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->notifyDataSetChanged()V

    .line 164
    return-void

    .line 144
    :cond_1
    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/widget/ListViewItem;

    .line 146
    .local v2, "item":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    invoke-virtual {v2}, Lcom/thetransitapp/droid/widget/ListViewItem;->hasValue()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 147
    invoke-virtual {v2}, Lcom/thetransitapp/droid/widget/ListViewItem;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/ScheduleItem;->getRealStopTime()Ljava/util/Date;

    move-result-object v5

    if-nez v5, :cond_3

    .line 148
    invoke-virtual {v2}, Lcom/thetransitapp/droid/widget/ListViewItem;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPastItem()Z

    move-result v5

    if-nez v5, :cond_2

    if-nez v3, :cond_2

    .line 149
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 152
    :cond_3
    const/4 v3, 0x1

    goto :goto_2

    .line 158
    .end local v2    # "item":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/widget/ListViewItem;

    .line 159
    .restart local v2    # "item":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    invoke-virtual {v0, v2}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->remove(Ljava/lang/Object;)V

    goto :goto_1
.end method
