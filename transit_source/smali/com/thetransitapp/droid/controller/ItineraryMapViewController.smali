.class public Lcom/thetransitapp/droid/controller/ItineraryMapViewController;
.super Ljava/lang/Object;
.source "ItineraryMapViewController.java"

# interfaces
.implements Lcom/thetransitapp/droid/service/ServiceCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/thetransitapp/droid/service/ServiceCallback",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType:[I


# instance fields
.field private final context:Landroid/content/Context;

.field private scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

.field private view:Lcom/thetransitapp/droid/ItineraryScreen;

.field private viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;


# direct methods
.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType()[I
    .locals 3

    .prologue
    .line 18
    sget-object v0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->$SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/model/Route$RouteType;->values()[Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->BUS:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_7

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->CABLE_CAR:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_6

    :goto_2
    :try_start_2
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->FERRY:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_5

    :goto_3
    :try_start_3
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->FUNICULAR:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_4

    :goto_4
    :try_start_4
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->GONDOLA:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_3

    :goto_5
    :try_start_5
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->SUBWAY:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_2

    :goto_6
    :try_start_6
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->TRAIN:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_1

    :goto_7
    :try_start_7
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->TRAMWAY:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_0

    :goto_8
    sput-object v0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->$SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_8

    :catch_1
    move-exception v1

    goto :goto_7

    :catch_2
    move-exception v1

    goto :goto_6

    :catch_3
    move-exception v1

    goto :goto_5

    :catch_4
    move-exception v1

    goto :goto_4

    :catch_5
    move-exception v1

    goto :goto_3

    :catch_6
    move-exception v1

    goto :goto_2

    :catch_7
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->context:Landroid/content/Context;

    .line 28
    return-void
.end method

.method private fetchItineraries()V
    .locals 5

    .prologue
    .line 89
    invoke-virtual {p0}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v0

    .line 91
    .local v0, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getItinerary()Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v2

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getTripId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/thetransitapp/droid/model/Itinerary;->isTripLoaded(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 92
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    if-nez v2, :cond_0

    .line 93
    new-instance v1, Lcom/thetransitapp/droid/model/DetailRequest;

    invoke-direct {v1}, Lcom/thetransitapp/droid/model/DetailRequest;-><init>()V

    .line 94
    .local v1, "request":Lcom/thetransitapp/droid/model/DetailRequest;
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v2

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getItineraries()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/DetailRequest;->setItineraries(Ljava/util/List;)V

    .line 95
    invoke-virtual {v1, v0}, Lcom/thetransitapp/droid/model/DetailRequest;->setScheduleItem(Lcom/thetransitapp/droid/model/ScheduleItem;)V

    .line 97
    new-instance v2, Lcom/thetransitapp/droid/service/ItinerariesTask;

    iget-object v3, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->context:Landroid/content/Context;

    invoke-direct {v2, v3, v1, p0}, Lcom/thetransitapp/droid/service/ItinerariesTask;-><init>(Landroid/content/Context;Lcom/thetransitapp/droid/model/DetailRequest;Lcom/thetransitapp/droid/service/ServiceCallback;)V

    invoke-virtual {v2}, Lcom/thetransitapp/droid/service/ItinerariesTask;->execute()V

    .line 104
    .end local v1    # "request":Lcom/thetransitapp/droid/model/DetailRequest;
    :goto_0
    return-void

    .line 99
    :cond_0
    new-instance v2, Lcom/thetransitapp/droid/service/ItineraryTask;

    iget-object v3, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->context:Landroid/content/Context;

    iget-object v4, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-direct {v2, v3, v4, p0}, Lcom/thetransitapp/droid/service/ItineraryTask;-><init>(Landroid/content/Context;Lcom/thetransitapp/droid/model/ScheduleItem;Lcom/thetransitapp/droid/service/ServiceCallback;)V

    invoke-virtual {v2}, Lcom/thetransitapp/droid/service/ItineraryTask;->execute()V

    goto :goto_0

    .line 102
    :cond_1
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->view:Lcom/thetransitapp/droid/ItineraryScreen;

    iget-object v3, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v2, v3}, Lcom/thetransitapp/droid/ItineraryScreen;->showDirection(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    goto :goto_0
.end method


# virtual methods
.method public changeDirection()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 51
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getNextItinerary(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->view:Lcom/thetransitapp/droid/ItineraryScreen;

    iget-object v2, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0, v2, v1}, Lcom/thetransitapp/droid/ItineraryScreen;->updateContent(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Z)V

    .line 53
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->fetchItineraries()V

    .line 57
    :goto_1
    return-void

    :cond_0
    move v0, v1

    .line 51
    goto :goto_0

    .line 55
    :cond_1
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->view:Lcom/thetransitapp/droid/ItineraryScreen;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/ItineraryScreen;->shakeRoute()V

    goto :goto_1
.end method

.method public getMarkerZoomLevel()F
    .locals 2

    .prologue
    .line 60
    invoke-static {}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->$SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType()[I

    move-result-object v0

    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route;->getType()Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 68
    const/high16 v0, 0x41680000    # 14.5f

    :goto_0
    return v0

    .line 62
    :pswitch_0
    const/high16 v0, 0x41480000    # 12.5f

    goto :goto_0

    .line 65
    :pswitch_1
    const/high16 v0, 0x41280000    # 10.5f

    goto :goto_0

    .line 60
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;
    .locals 2

    .prologue
    .line 73
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    if-eqz v1, :cond_0

    .line 74
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 85
    :goto_0
    return-object v1

    .line 75
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 76
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v1

    goto :goto_0

    .line 79
    :cond_1
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getScheduleItems()Ljava/util/List;

    move-result-object v0

    .line 81
    .local v0, "items":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 82
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/ScheduleItem;

    goto :goto_0

    .line 85
    :cond_2
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public init(Lcom/thetransitapp/droid/ItineraryScreen;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Lcom/thetransitapp/droid/model/ScheduleItem;)V
    .locals 3
    .param p1, "view"    # Lcom/thetransitapp/droid/ItineraryScreen;
    .param p2, "viewModel"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .param p3, "scheduleItem"    # Lcom/thetransitapp/droid/model/ScheduleItem;

    .prologue
    .line 31
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->view:Lcom/thetransitapp/droid/ItineraryScreen;

    .line 32
    iput-object p2, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .line 33
    iput-object p3, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 35
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->view:Lcom/thetransitapp/droid/ItineraryScreen;

    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/thetransitapp/droid/ItineraryScreen;->updateContent(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Z)V

    .line 36
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->fetchItineraries()V

    .line 37
    return-void
.end method

.method public onError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 47
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->context:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 48
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->onResult(Ljava/lang/Void;)V

    return-void
.end method

.method public onResult(Ljava/lang/Void;)V
    .locals 2
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    .line 41
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->updateServiceItem()V

    .line 42
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->view:Lcom/thetransitapp/droid/ItineraryScreen;

    iget-object v1, p0, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/ItineraryScreen;->showDirection(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    .line 43
    return-void
.end method
