.class public Lcom/thetransitapp/droid/widget/route/RouteAdapter;
.super Landroid/widget/ArrayAdapter;
.source "RouteAdapter.java"

# interfaces
.implements Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/thetransitapp/droid/widget/route/RouteItem;",
        ">;",
        "Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;"
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType:[I

.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$LongClickType:[I


# instance fields
.field private callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

.field private emptyInactiveRoute:Z

.field private final inflater:Landroid/view/LayoutInflater;

.field private lastOpen:Lcom/thetransitapp/droid/widget/route/RouteItem;

.field private final preferences:Landroid/content/SharedPreferences;

.field private final statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;


# direct methods
.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType()[I
    .locals 3

    .prologue
    .line 23
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->values()[Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->DEFAULT:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_6

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->FAVORITE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_5

    :goto_2
    :try_start_2
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MAP:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_4

    :goto_3
    :try_start_3
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MENU_OPEN:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :goto_4
    :try_start_4
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->NONE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_2

    :goto_5
    :try_start_5
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->SWITCH_DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_1

    :goto_6
    :try_start_6
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->TIMETABLE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_0

    :goto_7
    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_7

    :catch_1
    move-exception v1

    goto :goto_6

    :catch_2
    move-exception v1

    goto :goto_5

    :catch_3
    move-exception v1

    goto :goto_4

    :catch_4
    move-exception v1

    goto :goto_3

    :catch_5
    move-exception v1

    goto :goto_2

    :catch_6
    move-exception v1

    goto :goto_1
.end method

.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$LongClickType()[I
    .locals 3

    .prologue
    .line 23
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$LongClickType:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->values()[Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_1

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->TIME:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$LongClickType:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/thetransitapp/droid/model/stats/StatsManager;Landroid/content/SharedPreferences;Landroid/view/LayoutInflater;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "statsManager"    # Lcom/thetransitapp/droid/model/stats/StatsManager;
    .param p3, "preferences"    # Landroid/content/SharedPreferences;
    .param p4, "inflater"    # Landroid/view/LayoutInflater;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation

    .prologue
    .line 56
    const v0, 0x7f030021

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 58
    iput-object p2, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    .line 59
    iput-object p3, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->preferences:Landroid/content/SharedPreferences;

    .line 60
    iput-object p4, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 61
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/widget/route/RouteAdapter;)Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    return-object v0
.end method


# virtual methods
.method public addRoute(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
    .locals 2
    .param p1, "viewModel"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    .line 166
    new-instance v0, Lcom/thetransitapp/droid/widget/route/RouteItem;

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->preferences:Landroid/content/SharedPreferences;

    invoke-direct {v0, p1, p0, v1}, Lcom/thetransitapp/droid/widget/route/RouteItem;-><init>(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;Landroid/content/SharedPreferences;)V

    invoke-super {p0, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 167
    return-void
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const v8, 0x7f050050

    const/4 v7, 0x0

    .line 65
    invoke-super {p0, p1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/widget/route/RouteItem;

    .line 66
    .local v1, "item":Lcom/thetransitapp/droid/widget/route/RouteItem;
    move-object v3, p2

    .line 68
    .local v3, "view":Landroid/view/View;
    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v4

    if-eqz v4, :cond_0

    const v4, 0x7f050053

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 69
    :cond_0
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_2

    .line 70
    :cond_1
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 71
    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->inflater:Landroid/view/LayoutInflater;

    const v5, 0x7f030021

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 77
    :cond_2
    :goto_0
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 78
    invoke-virtual {v1, v3, v7}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setView(Landroid/view/View;Z)V

    .line 80
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v2

    .line 81
    .local v2, "itinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    check-cast p3, Landroid/widget/ListView;

    .end local p3    # "parent":Landroid/view/ViewGroup;
    invoke-virtual {v2, p3, v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->updateRealTimeDataOnList(Landroid/widget/ListView;Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    .line 104
    .end local v2    # "itinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    :goto_1
    return-object v3

    .line 73
    .restart local p3    # "parent":Landroid/view/ViewGroup;
    :cond_3
    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->inflater:Landroid/view/LayoutInflater;

    const v5, 0x7f03001f

    invoke-virtual {v4, v5, p3, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    goto :goto_0

    .line 83
    :cond_4
    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 85
    .local v0, "button":Landroid/widget/Button;
    iget-boolean v4, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->emptyInactiveRoute:Z

    if-eqz v4, :cond_5

    .line 86
    const v4, 0x7f0a009b

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(I)V

    .line 92
    :goto_2
    new-instance v4, Lcom/thetransitapp/droid/widget/route/RouteAdapter$1;

    invoke-direct {v4, p0}, Lcom/thetransitapp/droid/widget/route/RouteAdapter$1;-><init>(Lcom/thetransitapp/droid/widget/route/RouteAdapter;)V

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    const v4, -0xd1d1d2

    const v5, -0xc1c1c2

    const v6, -0xb9b9ba

    const/4 v7, 0x1

    invoke-static {v3, v4, v5, v6, v7}, Lcom/thetransitapp/droid/util/BackgroundUtility;->setGlossyBackground(Landroid/view/View;IIIZ)V

    goto :goto_1

    .line 88
    :cond_5
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->getCount()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ne p1, v4, :cond_6

    const v4, 0x7f0a009a

    :goto_3
    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(I)V

    goto :goto_2

    .line 89
    :cond_6
    const v4, 0x7f0a009c

    goto :goto_3
.end method

.method public onClick(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;)V
    .locals 2
    .param p1, "clickType"    # Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;
    .param p2, "routeItem"    # Lcom/thetransitapp/droid/widget/route/RouteItem;

    .prologue
    .line 109
    invoke-static {}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType()[I

    move-result-object v0

    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 144
    :cond_0
    :goto_0
    :pswitch_0
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    invoke-virtual {p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/stats/StatsManager;->recordRouteHit(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)V

    .line 145
    return-void

    .line 111
    :pswitch_1
    invoke-virtual {p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->onChangeDirection()Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    invoke-virtual {p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->shakeTime()V

    goto :goto_0

    .line 117
    :pswitch_2
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    invoke-virtual {p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;->showItinerary(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    goto :goto_0

    .line 121
    :pswitch_3
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    invoke-virtual {p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;->showSchedules(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    goto :goto_0

    .line 125
    :pswitch_4
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    invoke-virtual {p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;->toggleFavorite(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    .line 126
    invoke-virtual {p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->refreshView()V

    goto :goto_0

    .line 130
    :pswitch_5
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->lastOpen:Lcom/thetransitapp/droid/widget/route/RouteItem;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->lastOpen:Lcom/thetransitapp/droid/widget/route/RouteItem;

    if-eq v0, p2, :cond_1

    .line 131
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->lastOpen:Lcom/thetransitapp/droid/widget/route/RouteItem;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/route/RouteItem;->hideMenu()V

    .line 134
    :cond_1
    iput-object p2, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->lastOpen:Lcom/thetransitapp/droid/widget/route/RouteItem;

    goto :goto_0

    .line 138
    :pswitch_6
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    invoke-interface {v0, p2}, Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;->menuExpanded(Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    goto :goto_0

    .line 109
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_0
        :pswitch_6
    .end packed-switch
.end method

.method public onLongClick(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;Landroid/view/View;)V
    .locals 2
    .param p1, "clickType"    # Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;
    .param p2, "routeItem"    # Lcom/thetransitapp/droid/widget/route/RouteItem;
    .param p3, "clicked"    # Landroid/view/View;

    .prologue
    .line 149
    invoke-static {}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$LongClickType()[I

    move-result-object v0

    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 158
    :goto_0
    return-void

    .line 151
    :pswitch_0
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    invoke-virtual {p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;->showDirectionPopover(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Landroid/view/View;)V

    goto :goto_0

    .line 155
    :pswitch_1
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    invoke-virtual {p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;->showTimePopover(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Landroid/view/View;)V

    goto :goto_0

    .line 149
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setCallback(Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;)V
    .locals 0
    .param p1, "callback"    # Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    .prologue
    .line 46
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    return-void
.end method

.method public setEmptyInactiveRoute(Z)V
    .locals 0
    .param p1, "emptyInactiveRoute"    # Z

    .prologue
    .line 50
    iput-boolean p1, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->emptyInactiveRoute:Z

    return-void
.end method

.method public setLastOpen(Lcom/thetransitapp/droid/widget/route/RouteItem;)V
    .locals 0
    .param p1, "lastOpen"    # Lcom/thetransitapp/droid/widget/route/RouteItem;

    .prologue
    .line 48
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->lastOpen:Lcom/thetransitapp/droid/widget/route/RouteItem;

    return-void
.end method

.method public viewMovedSieway()V
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->callback:Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    invoke-interface {v0}, Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;->viewMovedSideway()V

    .line 163
    return-void
.end method
