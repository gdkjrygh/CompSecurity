.class public Lcom/thetransitapp/droid/controller/ScheduleViewController;
.super Ljava/lang/Object;
.source "ScheduleViewController.java"

# interfaces
.implements Lcom/thetransitapp/droid/service/ServiceCallback;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/thetransitapp/droid/service/ServiceCallback",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/thetransitapp/droid/model/Schedule;",
        ">;>;",
        "Landroid/widget/AdapterView$OnItemClickListener;",
        "Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;"
    }
.end annotation


# instance fields
.field private addDay:I

.field private final context:Landroid/content/Context;

.field private final dataSource:Lcom/thetransitapp/droid/widget/ScheduleAdapter;

.field private dayShown:I

.field private handler:Landroid/os/Handler;

.field private loading:Z

.field private view:Lcom/thetransitapp/droid/SchedulesScreen;

.field private viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;


# direct methods
.method public constructor <init>(Lcom/thetransitapp/droid/widget/ScheduleAdapter;Landroid/content/Context;)V
    .locals 1
    .param p1, "dataSource"    # Lcom/thetransitapp/droid/widget/ScheduleAdapter;
    .param p2, "context"    # Landroid/content/Context;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->addDay:I

    .line 48
    iput v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->handler:Landroid/os/Handler;

    .line 53
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dataSource:Lcom/thetransitapp/droid/widget/ScheduleAdapter;

    .line 54
    iput-object p2, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->context:Landroid/content/Context;

    .line 56
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dataSource:Lcom/thetransitapp/droid/widget/ScheduleAdapter;

    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->setOnReachEndListener(Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;)V

    .line 57
    return-void
.end method

.method static synthetic access$1(Lcom/thetransitapp/droid/controller/ScheduleViewController;)Lcom/thetransitapp/droid/SchedulesScreen;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->view:Lcom/thetransitapp/droid/SchedulesScreen;

    return-object v0
.end method

.method static synthetic access$2(Lcom/thetransitapp/droid/controller/ScheduleViewController;)Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    return-object v0
.end method

.method static synthetic access$3(Lcom/thetransitapp/droid/controller/ScheduleViewController;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method private showSchedules()V
    .locals 9

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 190
    iget-object v7, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v7}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v3

    .line 191
    .local v3, "itinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->updateServiceItem()V

    .line 193
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getScheduleItems()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_1

    .line 194
    iget v7, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    if-ltz v7, :cond_2

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    const/16 v8, 0xb

    invoke-virtual {v7, v8}, Ljava/util/Calendar;->get(I)I

    move-result v7

    const/16 v8, 0x8

    if-lt v7, v8, :cond_0

    iget v7, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    if-eqz v7, :cond_2

    :cond_0
    move v1, v5

    .line 196
    .local v1, "firstLoad":Z
    :goto_0
    if-eqz v1, :cond_3

    .line 197
    iget-object v6, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dataSource:Lcom/thetransitapp/droid/widget/ScheduleAdapter;

    invoke-virtual {v6}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->clear()V

    .line 206
    :goto_1
    iget-object v6, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dataSource:Lcom/thetransitapp/droid/widget/ScheduleAdapter;

    new-instance v7, Lcom/thetransitapp/droid/model/ServiceDay;

    iget v8, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    invoke-direct {v7, v8}, Lcom/thetransitapp/droid/model/ServiceDay;-><init>(I)V

    invoke-virtual {v3, v7}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getScheduleItems(Lcom/thetransitapp/droid/model/ServiceDay;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->addSchedule(Ljava/util/List;)V

    .line 208
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_1

    .line 209
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 210
    .local v2, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    iget-object v5, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dataSource:Lcom/thetransitapp/droid/widget/ScheduleAdapter;

    new-instance v6, Lcom/thetransitapp/droid/widget/ListViewItem;

    invoke-direct {v6, v2}, Lcom/thetransitapp/droid/widget/ListViewItem;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->getPosition(Ljava/lang/Object;)I

    move-result v4

    .line 212
    .local v4, "position":I
    iget v5, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    if-nez v5, :cond_1

    .line 213
    iget-object v5, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->view:Lcom/thetransitapp/droid/SchedulesScreen;

    invoke-virtual {v5, v4}, Lcom/thetransitapp/droid/SchedulesScreen;->setSelected(I)V

    .line 218
    .end local v1    # "firstLoad":Z
    .end local v2    # "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    .end local v4    # "position":I
    :cond_1
    iget v5, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    add-int/lit8 v5, v5, 0x1

    iput v5, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    .line 219
    return-void

    :cond_2
    move v1, v6

    .line 194
    goto :goto_0

    .line 199
    .restart local v1    # "firstLoad":Z
    :cond_3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 200
    .local v0, "calendar":Ljava/util/Calendar;
    const/4 v7, 0x6

    iget v8, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    invoke-virtual {v0, v7, v8}, Ljava/util/Calendar;->add(II)V

    .line 202
    iget-object v7, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dataSource:Lcom/thetransitapp/droid/widget/ScheduleAdapter;

    invoke-static {v6}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v6

    .line 203
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v8

    .line 202
    invoke-virtual {v6, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->addTitle(Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public changeDirection()V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v4, -0x1

    const/4 v1, 0x0

    .line 152
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getNextItinerary(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 153
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->view:Lcom/thetransitapp/droid/SchedulesScreen;

    iget-object v3, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0, v3, v2}, Lcom/thetransitapp/droid/SchedulesScreen;->updateContent(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Z)V

    .line 155
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v2, 0xb

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/16 v2, 0x8

    if-ge v0, v2, :cond_1

    .line 156
    iput v4, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->addDay:I

    .line 157
    iput v4, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    .line 163
    :goto_1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->onReachEnd()V

    .line 167
    :goto_2
    return-void

    :cond_0
    move v0, v2

    .line 152
    goto :goto_0

    .line 159
    :cond_1
    iput v1, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->addDay:I

    .line 160
    iput v1, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    goto :goto_1

    .line 165
    :cond_2
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->view:Lcom/thetransitapp/droid/SchedulesScreen;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/SchedulesScreen;->shakeRoute()V

    goto :goto_2
.end method

.method public getDataSource()Lcom/thetransitapp/droid/widget/ScheduleAdapter;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dataSource:Lcom/thetransitapp/droid/widget/ScheduleAdapter;

    return-object v0
.end method

.method public init(Lcom/thetransitapp/droid/SchedulesScreen;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
    .locals 4
    .param p1, "view"    # Lcom/thetransitapp/droid/SchedulesScreen;
    .param p2, "viewModel"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    const/4 v3, -0x1

    const/4 v2, 0x0

    .line 60
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->view:Lcom/thetransitapp/droid/SchedulesScreen;

    .line 61
    iput-object p2, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .line 62
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->view:Lcom/thetransitapp/droid/SchedulesScreen;

    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0, v1, v2}, Lcom/thetransitapp/droid/SchedulesScreen;->updateContent(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Z)V

    .line 64
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    .line 65
    iput v3, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->addDay:I

    .line 66
    iput v3, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    .line 72
    :goto_0
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dataSource:Lcom/thetransitapp/droid/widget/ScheduleAdapter;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->clear()V

    .line 74
    invoke-virtual {p0}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->onReachEnd()V

    .line 75
    return-void

    .line 68
    :cond_0
    iput v2, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->addDay:I

    .line 69
    iput v2, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    goto :goto_0
.end method

.method public onError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 148
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->context:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 149
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .param p2, "view"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 171
    .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v4, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dataSource:Lcom/thetransitapp/droid/widget/ScheduleAdapter;

    invoke-virtual {v4, p3}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/widget/ListViewItem;

    .line 173
    .local v2, "item":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    invoke-virtual {v2}, Lcom/thetransitapp/droid/widget/ListViewItem;->hasValue()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 174
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 175
    .local v0, "data":Landroid/os/Bundle;
    const-string v4, "route"

    iget-object v5, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 176
    const-string v5, "scheduleItem"

    invoke-virtual {v2}, Lcom/thetransitapp/droid/widget/ListViewItem;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/io/Serializable;

    invoke-virtual {v0, v5, v4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 177
    const-string v5, "tripId"

    invoke-virtual {v2}, Lcom/thetransitapp/droid/widget/ListViewItem;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/ScheduleItem;->getTripId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v5, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    new-instance v1, Lcom/thetransitapp/droid/ItineraryScreen;

    invoke-direct {v1}, Lcom/thetransitapp/droid/ItineraryScreen;-><init>()V

    .line 180
    .local v1, "fragment":Landroid/support/v4/app/Fragment;
    invoke-virtual {v1, v0}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 182
    iget-object v4, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->view:Lcom/thetransitapp/droid/SchedulesScreen;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/SchedulesScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 183
    .local v3, "transaction":Landroid/support/v4/app/FragmentTransaction;
    const v4, 0x7f05003a

    sget-object v5, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v1, v5}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 184
    sget-object v4, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 185
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 187
    .end local v0    # "data":Landroid/os/Bundle;
    .end local v1    # "fragment":Landroid/support/v4/app/Fragment;
    .end local v3    # "transaction":Landroid/support/v4/app/FragmentTransaction;
    :cond_0
    return-void
.end method

.method public onReachEnd()V
    .locals 5

    .prologue
    .line 79
    iget-boolean v3, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->loading:Z

    if-eqz v3, :cond_0

    .line 98
    :goto_0
    return-void

    .line 83
    :cond_0
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->loading:Z

    .line 85
    new-instance v0, Lcom/thetransitapp/droid/model/ServiceDay;

    iget v3, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->addDay:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->addDay:I

    invoke-direct {v0, v3}, Lcom/thetransitapp/droid/model/ServiceDay;-><init>(I)V

    .line 86
    .local v0, "day":Lcom/thetransitapp/droid/model/ServiceDay;
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v1

    .line 88
    .local v1, "itinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getServiceDates()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 89
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getServiceDates()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    :cond_1
    new-instance v2, Lcom/thetransitapp/droid/model/ScheduleRequest;

    invoke-direct {v2}, Lcom/thetransitapp/droid/model/ScheduleRequest;-><init>()V

    .line 93
    .local v2, "request":Lcom/thetransitapp/droid/model/ScheduleRequest;
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/thetransitapp/droid/model/ScheduleRequest;->setRoute(Lcom/thetransitapp/droid/model/Route;)V

    .line 94
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/thetransitapp/droid/model/ScheduleRequest;->setStop(Lcom/thetransitapp/droid/model/Stop;)V

    .line 95
    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->setServiceDay(Lcom/thetransitapp/droid/model/ServiceDay;)V

    .line 97
    new-instance v3, Lcom/thetransitapp/droid/service/SchedulesTask;

    iget-object v4, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->context:Landroid/content/Context;

    invoke-direct {v3, v4, v2, p0}, Lcom/thetransitapp/droid/service/SchedulesTask;-><init>(Landroid/content/Context;Lcom/thetransitapp/droid/model/ScheduleRequest;Lcom/thetransitapp/droid/service/ServiceCallback;)V

    invoke-virtual {v3}, Lcom/thetransitapp/droid/service/SchedulesTask;->execute()V

    goto :goto_0
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->onResult(Ljava/util/List;)V

    return-void
.end method

.method public onResult(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Schedule;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "result":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Schedule;>;"
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 102
    iget-object v10, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getItineraries()Ljava/util/List;

    move-result-object v1

    .line 103
    .local v1, "existings":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/Itinerary;

    .line 104
    .local v2, "exists":Lcom/thetransitapp/droid/model/Itinerary;
    iget-object v10, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v7

    .line 105
    .local v7, "stop":Lcom/thetransitapp/droid/model/Stop;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Itinerary;->getDirectionType()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v0

    .line 107
    .local v0, "direction":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    invoke-virtual {v2, v7}, Lcom/thetransitapp/droid/model/Itinerary;->getGroupingKey(Lcom/thetransitapp/droid/model/Stop;)Ljava/lang/String;

    move-result-object v4

    .line 111
    .local v4, "key":Ljava/lang/String;
    iget-object v10, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/Route;->getItineraries()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_0
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_2

    .line 123
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->showSchedules()V

    .line 124
    iput-boolean v8, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->loading:Z

    .line 126
    iget v8, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    if-nez v8, :cond_6

    .line 127
    invoke-virtual {p0}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->onReachEnd()V

    .line 144
    :cond_1
    :goto_1
    return-void

    .line 111
    :cond_2
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/thetransitapp/droid/model/Itinerary;

    .line 112
    .local v3, "iti":Lcom/thetransitapp/droid/model/Itinerary;
    if-eqz v4, :cond_3

    invoke-virtual {v3, v7}, Lcom/thetransitapp/droid/model/Itinerary;->getGroupingKey(Lcom/thetransitapp/droid/model/Stop;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    move v5, v8

    .line 113
    .local v5, "sameKey":Z
    :goto_2
    if-eqz v7, :cond_4

    iget-object v11, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v11}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v11

    invoke-virtual {v3, v11}, Lcom/thetransitapp/droid/model/Itinerary;->getClosestStop(Lcom/thetransitapp/droid/model/SimplePlacemark;)Lcom/thetransitapp/droid/model/Stop;

    move-result-object v11

    invoke-virtual {v7, v11}, Lcom/thetransitapp/droid/model/Stop;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    move v6, v8

    .line 115
    .local v6, "sameStop":Z
    :goto_3
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 116
    invoke-interface {v1, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v11

    invoke-interface {v1, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 117
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .end local v5    # "sameKey":Z
    .end local v6    # "sameStop":Z
    :cond_3
    move v5, v9

    .line 112
    goto :goto_2

    .restart local v5    # "sameKey":Z
    :cond_4
    move v6, v9

    .line 113
    goto :goto_3

    .line 118
    .restart local v6    # "sameStop":Z
    :cond_5
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/Itinerary;->getDirectionType()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v11

    if-ne v11, v0, :cond_0

    if-eqz v5, :cond_0

    if-eqz v6, :cond_0

    .line 119
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 128
    .end local v3    # "iti":Lcom/thetransitapp/droid/model/Itinerary;
    .end local v5    # "sameKey":Z
    .end local v6    # "sameStop":Z
    :cond_6
    iget v8, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->dayShown:I

    if-ne v8, v9, :cond_1

    .line 129
    iget-object v8, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->handler:Landroid/os/Handler;

    if-nez v8, :cond_1

    .line 130
    new-instance v8, Landroid/os/Handler;

    invoke-direct {v8}, Landroid/os/Handler;-><init>()V

    iput-object v8, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->handler:Landroid/os/Handler;

    .line 131
    iget-object v8, p0, Lcom/thetransitapp/droid/controller/ScheduleViewController;->handler:Landroid/os/Handler;

    new-instance v9, Lcom/thetransitapp/droid/controller/ScheduleViewController$1;

    invoke-direct {v9, p0}, Lcom/thetransitapp/droid/controller/ScheduleViewController$1;-><init>(Lcom/thetransitapp/droid/controller/ScheduleViewController;)V

    .line 141
    const-wide/16 v10, 0x3e8

    .line 131
    invoke-virtual {v8, v9, v10, v11}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1
.end method
