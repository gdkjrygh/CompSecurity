.class public Lcom/thetransitapp/droid/SchedulesScreen;
.super Lcom/thetransitapp/droid/BaseItinerariesScreen;
.source "SchedulesScreen.java"


# instance fields
.field private routeContent:Landroid/widget/LinearLayout;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050051
    .end annotation
.end field

.field private scheduleList:Landroid/widget/ListView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050093
    .end annotation
.end field

.field private viewController:Lcom/thetransitapp/droid/controller/ScheduleViewController;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->SCHEDULE_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;-><init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 28
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/SchedulesScreen;)Lcom/thetransitapp/droid/controller/ScheduleViewController;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/thetransitapp/droid/SchedulesScreen;->viewController:Lcom/thetransitapp/droid/controller/ScheduleViewController;

    return-object v0
.end method


# virtual methods
.method public getScheduleList()Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/thetransitapp/droid/SchedulesScreen;->scheduleList:Landroid/widget/ListView;

    return-object v0
.end method

.method public onStart()V
    .locals 3

    .prologue
    .line 47
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->onStart()V

    .line 49
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 51
    .local v0, "args":Landroid/os/Bundle;
    const-string v2, "route"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 52
    const-string v2, "route"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .line 54
    .local v1, "viewModel":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    iget-object v2, p0, Lcom/thetransitapp/droid/SchedulesScreen;->viewController:Lcom/thetransitapp/droid/controller/ScheduleViewController;

    invoke-virtual {v2, p0, v1}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->init(Lcom/thetransitapp/droid/SchedulesScreen;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    .line 56
    .end local v1    # "viewModel":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 32
    invoke-super {p0, p1, p2}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 34
    iget-object v0, p0, Lcom/thetransitapp/droid/SchedulesScreen;->scheduleList:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/thetransitapp/droid/SchedulesScreen;->viewController:Lcom/thetransitapp/droid/controller/ScheduleViewController;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->getDataSource()Lcom/thetransitapp/droid/widget/ScheduleAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 35
    iget-object v0, p0, Lcom/thetransitapp/droid/SchedulesScreen;->scheduleList:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/thetransitapp/droid/SchedulesScreen;->viewController:Lcom/thetransitapp/droid/controller/ScheduleViewController;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 37
    iget-object v0, p0, Lcom/thetransitapp/droid/SchedulesScreen;->routeContent:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/thetransitapp/droid/SchedulesScreen$1;

    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/SchedulesScreen$1;-><init>(Lcom/thetransitapp/droid/SchedulesScreen;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    return-void
.end method

.method public setSelected(I)V
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 59
    iget-object v0, p0, Lcom/thetransitapp/droid/SchedulesScreen;->scheduleList:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setSelection(I)V

    .line 60
    return-void
.end method
